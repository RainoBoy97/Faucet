package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector3d

class Point(val location: Vector3d) : Region {

    override fun contains(point: Vector3d): Boolean = point.x ==  location.x && point.y == location.y && point.z == location.z

}