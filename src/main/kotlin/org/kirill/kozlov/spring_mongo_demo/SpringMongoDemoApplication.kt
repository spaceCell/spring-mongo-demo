package org.kirill.kozlov.spring_mongo_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringMongoDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringMongoDemoApplication>(*args)
}
