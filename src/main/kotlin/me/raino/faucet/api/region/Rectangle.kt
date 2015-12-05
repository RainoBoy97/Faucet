package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector2d
import com.flowpowered.math.vector.Vector3d

class Rectangle(val min: Vector2d, val max: Vector2d) : Region {

    override fun contains(point: Vector3d): Boolean = contains(point.toVector2(true))

    override fun contains(point: Vector2d): Boolean {
        return point.x >= min.x && point.x <= max.x && point.y >= min.y && point.y <= max.y
    }

}