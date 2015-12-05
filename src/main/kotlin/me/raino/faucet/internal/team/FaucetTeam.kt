package me.raino.faucet.internal.team

import me.raino.faucet.api.player.GamePlayer
import me.raino.faucet.api.team.Team
import me.raino.faucet.api.team.TeamType
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.Texts
import org.spongepowered.api.text.format.TextColor
import java.util.*

class FaucetTeam(
        override var name: String,
        override var color: TextColor,
        override var max: Int,
        override var type: TeamType
        ) : Team {

    override val coloredName: Text = Texts.of(color, name)
    override val members: MutableSet<GamePlayer> = HashSet()

}