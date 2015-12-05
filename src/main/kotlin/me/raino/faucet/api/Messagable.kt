package me.raino.faucet.api

import org.spongepowered.api.text.Text

interface Messagable {

    fun sendMessage(vararg messages: Text)

}