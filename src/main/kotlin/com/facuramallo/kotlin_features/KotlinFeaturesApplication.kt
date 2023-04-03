package com.facuramallo.kotlin_features

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinFeaturesApplication

fun main(args: Array<String>) {
    runApplication<KotlinFeaturesApplication>(*args)

    val listOfNumnbers = listOf(0,1,2,3,4)

    listOfNumnbers.asSequence().onEach { println("computing seq map: square of $it")  }
        .map {  it * it }. onEach { println("computing seq filter: $it satisfies predicate") }
        .filter { it % 2 == 0 }
        .find { it >= 4 }
        .let { println( it.toString() ) }

    listOfNumnbers.onEach { println("computing map: square of $it")  }
        .map {  it * it }. onEach { println("computing filter: $it satisfies predicate") }
        .filter { it % 2 == 0 }
        .find { it >= 4 }
        .let { println( it.toString() ) }
}
