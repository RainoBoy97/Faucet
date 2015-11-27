package me.raino.gameengine.api.player

import me.raino.gameengine.api.Messagable
import me.raino.gameengine.api.Named
import me.raino.gameengine.api.Wrapper
import org.spongepowered.api.entity.living.player.Player
import java.util.*

interface GamePlayer : Named, Wrapper<Player>, Messagable {

    val uuid: UUID

}