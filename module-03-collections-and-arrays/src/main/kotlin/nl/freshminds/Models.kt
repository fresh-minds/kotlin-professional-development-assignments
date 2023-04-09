package nl.freshminds

import kotlinx.datetime.LocalDate
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.LongAsStringSerializer

/* This file does not contain any assignments! */

@Serializable
data class Races(
    @SerialName("Races") val races: List<Race>
)

@Serializable
data class Race(
    val season : Int,
    val round: Int,
    val date: LocalDate,
    @SerialName("Circuit") val circuit: Circuit,
    @SerialName("Results") val results: List<Result>
)

@Serializable
data class Circuit(
    val circuitId: String,
    val circuitName: String,
    @SerialName("Location") val location: Location
)

@Serializable
data class Location(
    val locality: String,
    val country: String
)

@Serializable
data class Result(
    val position: Int,
    val points: Int,
    val grid: Int,
    val laps: Int,
    val status: String,
    @SerialName("Driver") val driver: Driver,
    @SerialName("Constructor") val constructor: Constructor,
    @SerialName("Time") val time: Time? = null,
    @SerialName("FastestLap") val fastestLap: FastestLap? = null
)

@Serializable
data class Driver(
    val driverId: String,
    val givenName: String,
    val familyName: String,
    val dateOfBirth: LocalDate,
    val nationality: String
)

@Serializable
data class Constructor(
    val name: String,
    val nationality: String
)

@Serializable
data class Time(
    @Serializable(LongAsStringSerializer::class) val millis: Long
)

@Serializable
data class FastestLap(
    val rank: Int,
    val lap: Int,
)


// http://ergast.com/mrd/methods/results/
