package com.lunastratos.testjenkins.testjenkins


import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class HomeController @Autowired constructor(

){

    private val log: Logger = LoggerFactory.getLogger(HomeController::class.java)

    @RequestMapping("/test", method = arrayOf(RequestMethod.GET))
    @ResponseBody
    fun home(    ): ResponseEntity<*>? {

        val result = "ok!"
        try {
            return ResponseEntity.ok<Any>(result.toString())
        }catch (e:Exception){
            return ResponseEntity.badRequest()
                .body<Any>(result.toString())
        }

    }

}