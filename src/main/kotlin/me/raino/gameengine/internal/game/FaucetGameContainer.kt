package me.raino.gameengine.internal.game

import com.google.inject.Injector
import me.raino.gameengine.api.game.Game
import me.raino.gameengine.api.game.GameContainer

class FaucetGameContainer(val injector: Injector, gameClass: Class<*>) : GameContainer {

    override val name: String
    override val description: String
    override val instance: Any

    init {
        val game: Game = gameClass.getAnnotation(Game::class.java)
        name = game.name
        description = game.description
        instance = gameClass.newInstance()
    }

}