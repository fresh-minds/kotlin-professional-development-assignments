package nl.freshminds

import kotlinx.datetime.LocalDate
import org.junit.jupiter.api.Test
import java.time.DayOfWeek


import org.junit.jupiter.api.Assertions.assertEquals

class Assignment04Test {

    @Test
    fun `family name to name length`() {
        val expected = mapOf(
            "Verstappen" to 10,
            "Pérez" to 5,
            "Alonso" to 6,
            "Sainz" to 5,
            "Hamilton" to 8,
            "Stroll" to 6,
            "Russell" to 7,
            "Bottas" to 6,
            "Gasly" to 5,
            "Albon" to 5,
            "Tsunoda" to 7,
            "Sargeant" to 8,
            "Magnussen" to 9,
            "de Vries" to 8,
            "Hülkenberg" to 10,
            "Zhou" to 4,
            "Norris" to 6,
            "Ocon" to 4,
            "Leclerc" to 7,
            "Piastri" to 7
        )
        assertEquals(expected, familyNameToNameLength(F1DataSet.races.first().results))
    }

    @Test
    fun `date of birth to day of week`() {
        val expected = mapOf(
            LocalDate.parse("1997-09-30") to DayOfWeek.TUESDAY,
            LocalDate.parse("1990-01-26") to DayOfWeek.FRIDAY,
            LocalDate.parse("1981-07-29") to DayOfWeek.WEDNESDAY,
            LocalDate.parse("1994-09-01") to DayOfWeek.THURSDAY,
            LocalDate.parse("1985-01-07") to DayOfWeek.MONDAY,
            LocalDate.parse("1998-10-29") to DayOfWeek.THURSDAY,
            LocalDate.parse("1998-02-15") to DayOfWeek.SUNDAY,
            LocalDate.parse("1989-08-28") to DayOfWeek.MONDAY,
            LocalDate.parse("1996-02-07") to DayOfWeek.WEDNESDAY,
            LocalDate.parse("1996-03-23") to DayOfWeek.SATURDAY,
            LocalDate.parse("2000-05-11") to DayOfWeek.THURSDAY,
            LocalDate.parse("2000-12-31") to DayOfWeek.SUNDAY,
            LocalDate.parse("1992-10-05") to DayOfWeek.MONDAY,
            LocalDate.parse("1995-02-06") to DayOfWeek.MONDAY,
            LocalDate.parse("1987-08-19") to DayOfWeek.WEDNESDAY,
            LocalDate.parse("1999-05-30") to DayOfWeek.SUNDAY,
            LocalDate.parse("1999-11-13") to DayOfWeek.SATURDAY,
            LocalDate.parse("1996-09-17") to DayOfWeek.TUESDAY,
            LocalDate.parse("1997-10-16") to DayOfWeek.THURSDAY,
            LocalDate.parse("2001-04-06") to DayOfWeek.FRIDAY
        )

        assertEquals(expected, dayOfBirthToDayOfWeek(F1DataSet.drivers))
    }

    @Test
    fun `constructor name to nationality`() {
        val expected = mapOf(
            "Red Bull" to "Austrian",
            "Aston Martin" to "British",
            "Ferrari" to "Italian",
            "Mercedes" to "German",
            "Alfa Romeo" to "Swiss",
            "Alpine F1 Team" to "French",
            "Williams" to "British",
            "AlphaTauri" to "Italian",
            "Haas F1 Team" to "American",
            "McLaren" to "British"
        )

        assertEquals(expected, constructorNameToNationality(F1DataSet.constructors))
    }
}