package me.raino.gameengine.api.team

import me.raino.gameengine.api.Named
import me.raino.gameengine.api.player.GamePlayer
import org.spongepowered.api.text.format.TextColor

interface Team : Named {

    val color: TextColor
    val max: Int
    val type: TeamType
    val members: Set<GamePlayer>

    fun addMember(member: GamePlayer)

    fun removeMember(member: GamePlayer)

}