package nl.freshminds

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

object JsonFileDeserializer {

    inline fun <reified T> deserialize(fileName: String): T {
        val text = {}.javaClass.getResource(fileName)
            ?.readText()
            ?: throw IllegalArgumentException("File $fileName does not exist or is empty.")

        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
        }

        return json.decodeFromString(text)
    }
}

fun main() {

    JsonFileDeserializer.deserialize<Races>("/races.json")
        .races
        .first { it.round == 1 }
        .results
        .filter { it.points > 5 }
        .map { it.driver.familyName }
        .also { println(it) }

    JsonFileDeserializer.deserialize<Races>("/races.json")
        .races
        .flatMap { it.results }
        .map { it.constructor.name }
        .toSet()
        .also { println(it) }

    JsonFileDeserializer.deserialize<Races>("/races.json")
        .races
        .flatMap { it.results }
        .filter { it.constructor.name == "Williams" }
        .map { it.driver.familyName }
        .also { println(it) }
}