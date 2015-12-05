package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector2d
import com.flowpowered.math.vector.Vector3d

class Negative(val region: Region) : Region {

    override fun contains(point: Vector3d): Boolean = !region.contains(point)

    override fun contains(point: Vector2d): Boolean = !region.contains(point)

}