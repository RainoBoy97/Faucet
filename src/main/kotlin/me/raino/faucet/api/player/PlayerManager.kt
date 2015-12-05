package me.raino.faucet.api.player

import org.spongepowered.api.entity.living.player.Player
import java.util.*

interface PlayerManager {

    val players: Set<GamePlayer>

    fun createPlayer(player: Player): GamePlayer

    fun removePlayer(player: GamePlayer)

    fun getPlayer(name: String): GamePlayer?

    fun getPlayer(uuid: UUID): GamePlayer?

    fun getPlayer(player: Player): GamePlayer?

}