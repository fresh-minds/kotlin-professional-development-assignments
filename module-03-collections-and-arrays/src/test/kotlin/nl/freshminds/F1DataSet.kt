package nl.freshminds

import kotlinx.serialization.json.Json

private const val PATH_TO_RACES_JSON = "/races.json"

object F1DataSet {
    val races = JsonFileDeserializer.deserialize<Races>(PATH_TO_RACES_JSON).races

    val drivers = races.flatMap { it.results }
        .map { it.driver }
        .distinct()

    val constructors = races.flatMap { it.results }
        .map { it.constructor }
        .distinct()
}

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
