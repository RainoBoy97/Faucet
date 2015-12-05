package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector3d

class Sphere(val center: Vector3d, val radius: Double) : Region {

    override fun contains(point: Vector3d): Boolean = center.distanceSquared(point) <= radius.sqrd()

}