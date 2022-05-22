package com.learn.kotlinsample

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinsampleApplication

fun main(args: Array<String>) {
    runApplication<KotlinsampleApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
