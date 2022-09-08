package com.example

import com.example.plugins.configureKoin
import com.example.plugins.configureMonitoring
import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {

    configureKoin()
//    configureDefaultHeader()
    configureSerialization()
    configureMonitoring()
    configureRouting()
//    configureStatusPages()

}
