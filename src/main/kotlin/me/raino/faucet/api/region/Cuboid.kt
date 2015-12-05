package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector3d

class Cuboid(val min: Vector3d, val max: Vector3d) : Region {

    override fun contains(point: Vector3d): Boolean {
        return point.x >= min.x && point.x <= max.x && point.y >= min.y && point.y <= max.y && point.z >= min.z && point.z <= max.z
    }

}