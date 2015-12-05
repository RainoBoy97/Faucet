package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector2d
import com.flowpowered.math.vector.Vector3d

class Intersect(vararg val regions: Region) : Region {

    override fun contains(point: Vector3d): Boolean = regions.all { it.contains(point) }

    override fun contains(point: Vector2d): Boolean = regions.all { it.contains(point) }

}