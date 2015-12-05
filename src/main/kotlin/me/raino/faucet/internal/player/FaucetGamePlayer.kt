package me.raino.faucet.internal.player

import me.raino.faucet.api.player.GamePlayer
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text
import java.util.*

class FaucetGamePlayer(override val handle: Player) : GamePlayer {

    override val name: String
    override val uuid: UUID

    init {
        this.uuid = handle.uniqueId
        this.name = handle.name
    }

    override fun sendMessage(vararg messages: Text) {
        handle.sendMessages(*messages)
    }

}