package me.raino.faucet.internal.game

import me.raino.faucet.api.game.GameContainer
import me.raino.faucet.api.game.GameManager
import java.nio.file.Path
import java.util.*

class FaucetGameManager(override val directory: Path) : GameManager {

    override val games: MutableMap<String, GameContainer> = HashMap()

    override fun loadGames() {

    }

    override fun getGame(name: String): GameContainer? {
        return games[name]
    }

}