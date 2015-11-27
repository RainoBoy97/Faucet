package me.raino.gameengine.internal.player

import me.raino.gameengine.api.player.GamePlayer
import org.spongepowered.api.entity.living.player.Player
import java.util.*

class FaucetGamePlayer(override var handle: Player) : GamePlayer {

    override val uuid: UUID
    override val name: String

    init {
        uuid = handle.uniqueId
        name = handle.name
    }


}