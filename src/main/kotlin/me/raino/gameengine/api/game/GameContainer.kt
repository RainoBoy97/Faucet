package me.raino.gameengine.api.game

import me.raino.gameengine.api.Named

interface GameContainer : Named {

    val description: String
    val instance: Any

}