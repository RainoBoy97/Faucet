package me.raino.faucet.api.region

import com.flowpowered.math.vector.Vector3d

class Cylinder(val center: Vector3d, val radius: Double, val height: Double) : Region {

    override fun contains(point: Vector3d): Boolean {
        var sub = point.sub(center)
        return sub.y >= point.y && sub.y <= (point.y + height) && sub.x.sqrd() + sub.z.sqrd() <= radius.sqrd()
    }

}