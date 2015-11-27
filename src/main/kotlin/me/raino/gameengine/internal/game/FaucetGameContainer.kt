package me.raino.gameengine.internal.game

import com.google.inject.Injector
import me.raino.gameengine.api.game.GameContainer
import me.raino.gameengine.api.game.GameMeta

class FaucetGameContainer(val injector: Injector, gameClass: Class<*>) : GameContainer {

    override val name: String
    override val description: String
    override val instance: Any

    init {
        val game: GameMeta = gameClass.getAnnotation(GameMeta::class.java)
        name = game.name
        description = game.description
        instance = gameClass.newInstance()
    }

}