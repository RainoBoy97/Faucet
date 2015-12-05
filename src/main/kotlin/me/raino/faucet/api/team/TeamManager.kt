package me.raino.faucet.api.team

import org.spongepowered.api.text.format.TextColor

interface TeamManager {

    var teams: MutableSet<Team>

    fun createTeam(name: String, color: TextColor, max: Int = -1, type: TeamType = TeamType.PARTICIPATING): Team

}