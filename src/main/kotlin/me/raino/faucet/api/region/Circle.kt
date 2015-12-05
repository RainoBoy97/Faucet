package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector2d
import com.flowpowered.math.vector.Vector3d

class Circle(val center: Vector2d, val radius: Double) : Region {

    override fun contains(point: Vector3d): Boolean = contains(point.toVector2(true))

    override fun contains(point: Vector2d): Boolean {
        var sub = point.sub(center)
        return sub.x.sqrd() + sub.y.sqrd() <= radius.sqrd()
    }

}