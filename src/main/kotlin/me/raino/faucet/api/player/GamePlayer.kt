package me.raino.faucet.api.player

import me.raino.faucet.api.Messagable
import me.raino.faucet.api.Named
import me.raino.faucet.api.Wrapper
import org.spongepowered.api.entity.living.player.Player
import java.util.*

interface GamePlayer : Named, Wrapper<Player>, Messagable {

    val uuid: UUID

}