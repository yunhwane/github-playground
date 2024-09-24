package com.example.catchpr.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
class PrController {


    @RequestMapping("/health-check")
    fun getPrs(): String {
        return "OK"
    }
}