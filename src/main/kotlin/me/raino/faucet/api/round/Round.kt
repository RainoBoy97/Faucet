package me.raino.faucet.api.round

import me.raino.faucet.api.Messagable
import me.raino.faucet.api.game.GameContainer
import me.raino.faucet.api.player.GamePlayer
import org.spongepowered.api.text.Text

interface Round : Messagable {

    val game: GameContainer
    val state: RoundState
    val members: MutableSet<GamePlayer>

    fun start()

    fun end()

    override fun sendMessage(vararg messages: Text) {
        members.forEach { it.sendMessage(*messages) }
    }

}