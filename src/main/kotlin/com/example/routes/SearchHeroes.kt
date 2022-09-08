package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes(){

    val heroRepository: HeroRepository by inject()

    get("/searchHeroes"){
            try {
                val name = call.request.queryParameters["name"]
                val apiResponse = heroRepository.searchHeroes(name)
                call.respond(
                    message = apiResponse,
                    status = HttpStatusCode.OK
                )
            }
            catch (e:IllegalStateException){
                call.respond(
                    message = ApiResponse(success = false,message = "Something went wrong"),
                    status = HttpStatusCode.OK
                )
            }
    }
}