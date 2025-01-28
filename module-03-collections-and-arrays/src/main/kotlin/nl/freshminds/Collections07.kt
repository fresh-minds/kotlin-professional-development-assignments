package nl.freshminds

/**
 * Return the average lap number in which a driver set their fastest lap of the race.
 */
fun averageLapInWhichADriverSetTheirFastestLap(race: Race): Double {
    return race.results.mapNotNull { it.fastestLap?.lap }
        .average()
}

/**
 * Return the driver with the shortest given name for a specified nationality, or null if no drivers from such
 * nationality exist.
 */
fun driverWithShortestGivenName(nationality: String, drivers: List<Driver>): String? {
    return drivers.filter { it.nationality == nationality }
        .minByOrNull { it.givenName.length }
        ?.givenName
}