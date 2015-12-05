package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector2d
import com.flowpowered.math.vector.Vector3d

interface Region {

    fun contains(point: Vector3d): Boolean = false

    fun contains(point: Vector2d): Boolean = false

    fun Double.sqrd(): Double = times(this)

}