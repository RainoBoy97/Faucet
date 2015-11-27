package me.raino.gameengine.internal.team

import me.raino.gameengine.api.player.GamePlayer
import me.raino.gameengine.api.team.Team
import me.raino.gameengine.api.team.TeamType
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.Texts
import org.spongepowered.api.text.format.TextColor
import java.util.*

data class FaucetTeam(
        override var name: String,
        override var color: TextColor,
        override var max: Int,
        override var type: TeamType
        ) : Team {

    override val coloredName: Text = Texts.of(color, name)
    override val members: MutableSet<GamePlayer> = HashSet()

    override fun addMember(member: GamePlayer) {
        members.add(member)
    }

    override fun removeMember(member: GamePlayer) {
        members.remove(member)
    }

    override fun sendMessage(vararg texts: Text) {
        members.forEach { it.sendMessage(*texts) }
    }

}