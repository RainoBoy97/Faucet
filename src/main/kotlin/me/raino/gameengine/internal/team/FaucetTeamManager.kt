package me.raino.gameengine.internal.team

import me.raino.gameengine.api.team.Team
import me.raino.gameengine.api.team.TeamManager
import me.raino.gameengine.api.team.TeamType
import org.spongepowered.api.text.format.TextColor
import java.util.*

class FaucetTeamManager : TeamManager {

    override var teams: MutableSet<Team> = HashSet()

    override fun createTeam(name: String, color: TextColor, max: Int, type: TeamType): Team {
        val team: Team = FaucetTeam(name, color, max, type)
        teams.add(team)
        return team;
    }

}