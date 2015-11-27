package me.raino.gameengine.api

import org.spongepowered.api.text.Text

interface Messagable {

    fun sendMessage(vararg texts: Text)

}