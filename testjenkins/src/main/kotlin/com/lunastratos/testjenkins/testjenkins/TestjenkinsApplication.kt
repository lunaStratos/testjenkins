package com.lunastratos.testjenkins.testjenkins

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestjenkinsApplication

fun main(args: Array<String>) {
	runApplication<TestjenkinsApplication>(*args)
}
