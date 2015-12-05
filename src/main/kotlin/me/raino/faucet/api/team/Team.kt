package me.raino.faucet.api.team

import me.raino.faucet.api.Messagable
import me.raino.faucet.api.Named
import me.raino.faucet.api.player.GamePlayer
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor

interface Team : Named, Messagable {

    val color: TextColor
    val coloredName: Text
    val max: Int
    val type: TeamType
    val members: MutableSet<GamePlayer>

    fun addMember(member: GamePlayer) {
        members.add(member)
    }

    fun removeMember(member: GamePlayer) {
        members.remove(member)
    }

    override fun sendMessage(vararg messages: Text) {
        members.forEach { it.sendMessage(*messages) }
    }

}