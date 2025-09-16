package nl.freshminds

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate

/**
 * Return a map from driver family name to the length of the family name.
 */
fun familyNameToNameLength(results: List<Result>): Map<String, Int> {
    return results.map { it.driver.familyName }.associateWith { it.length }
}

/**
 * Return a map from date of birth to day of week.
 */
fun dayOfBirthToDayOfWeek(drivers: List<Driver>): Map<LocalDate, DayOfWeek> {
    return drivers.map { it.dateOfBirth }.associateWith { it.dayOfWeek }
}

/**
 * Return a map from constructor name to nationality.
 */
fun constructorNameToNationality(constructors: List<Constructor>): Map<String, String> {
    return constructors.associate { Pair(it.name, it.nationality) }
}
