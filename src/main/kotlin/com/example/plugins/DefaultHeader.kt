//package com.example.plugins
//
//import io.ktor.server.application.*
//import io.ktor.features.*
//import io.ktor.http.*
//import java.time.Duration
//import io.netty.handler.codec.DefaultHeaders
//import java.net.http.HttpHeaders
//
//
//fun Application.configureDefaultHeader(){
//    install(DefaultHeaders){
//        val oneYearInSeconds = Duration.ofDays(365).seconds
//        header(
//            name=HttpHeaders.CacheControl,
//            value = "public, max-age=$oneYearInSeconds, immutable"
//        )
//    }
//}