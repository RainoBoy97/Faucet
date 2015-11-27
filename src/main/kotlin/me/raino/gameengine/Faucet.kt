package me.raino.gameengine

import me.raino.gameengine.api.team.Team
import me.raino.gameengine.api.team.TeamManager
import me.raino.gameengine.api.team.TeamType
import me.raino.gameengine.internal.team.FaucetTeamManager
import org.slf4j.Logger
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.game.state.GameInitializationEvent
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.text.format.TextColors
import javax.inject.Inject

@Plugin(id = "Faucet", name = "Faucet", version = "1.0.0")
class Faucet {

    @Inject
    var logger: Logger? = null

    val teamManager: TeamManager = FaucetTeamManager()

    @Listener
    fun enable(event: GameInitializationEvent) {
        var team: Team = teamManager.createTeam("Observers", TextColors.AQUA, type = TeamType.SPECTATING)
        logger?.info(team.toString())
    }

}