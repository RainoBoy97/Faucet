package me.raino.faucet.api.game

import java.nio.file.Path

interface GameManager {

    val directory: Path
    val games: MutableMap<String, GameContainer>

    fun loadGames()

    fun getGame(name: String): GameContainer?

}