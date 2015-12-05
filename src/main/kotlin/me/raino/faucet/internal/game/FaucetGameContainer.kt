package me.raino.faucet.internal.game

import me.raino.faucet.api.game.GameContainer
import me.raino.faucet.api.game.Game

class FaucetGameContainer(gameClass: Class<*>) : GameContainer {

    override val name: String
    override val description: String
    override val instance: Any

    init {
        val game: Game = gameClass.getAnnotation(Game::class.java)

        this.name = game.name
        this.description = game.description
        this.instance = gameClass.newInstance()
    }

}