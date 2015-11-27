package me.raino.gameengine

import org.slf4j.Logger
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.game.state.GameInitializationEvent
import org.spongepowered.api.plugin.Plugin
import javax.inject.Inject

@Plugin(id = "Faucet", name = "Faucet", version = "1.0.0")
class Faucet {

    @Inject
    var logger: Logger? = null

    @Listener
    fun enable(event: GameInitializationEvent) {
        
    }

}