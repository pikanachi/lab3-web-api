package es.unizar.webeng.lab3

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Main

fun main(vararg args: String) {
    runApplication<Main>(*args)
}
