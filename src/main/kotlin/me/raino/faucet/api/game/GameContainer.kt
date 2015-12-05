package me.raino.faucet.api.game

import me.raino.faucet.api.Named

interface GameContainer : Named {

    val description: String
    val instance: Any

}