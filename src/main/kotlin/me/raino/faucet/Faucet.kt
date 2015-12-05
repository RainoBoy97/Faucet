package me.raino.faucet

import me.raino.faucet.api.game.GameManager
import me.raino.faucet.internal.game.FaucetGameManager
import org.slf4j.Logger
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.game.state.GameInitializationEvent
import org.spongepowered.api.plugin.Plugin
import java.nio.file.Paths
import javax.inject.Inject

@Plugin(id = "Faucet", name = "Faucet", version = "1.0.0")
class Faucet {

    @Inject
    var logger: Logger? = null

    var gameManager: GameManager? = null

    @Listener
    fun enable(event: GameInitializationEvent) {
        gameManager = FaucetGameManager(Paths.get("."))
    }

}