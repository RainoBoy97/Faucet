package me.raino.faucet.internal.player

import me.raino.faucet.api.player.GamePlayer
import me.raino.faucet.api.player.PlayerManager
import org.spongepowered.api.entity.living.player.Player
import java.util.*

class FaucetPlayerManager : PlayerManager {

    override val players: MutableSet<GamePlayer> = HashSet()

    override fun createPlayer(player: Player): GamePlayer {
        var gamePlayer: GamePlayer = FaucetGamePlayer(player)
        players.add(gamePlayer)
        return gamePlayer
    }

    override fun removePlayer(player: GamePlayer) {
        players.remove(player)
    }

    override fun getPlayer(name: String): GamePlayer? {
        return players.find { it.name.equals(name) }
    }

    override fun getPlayer(uuid: UUID): GamePlayer? {
        return players.find { it.uuid.equals(uuid) }
    }

    override fun getPlayer(player: Player): GamePlayer? {
        return players.find { it.handle.equals(player) }
    }

}