package nl.freshminds

/**
 * Return the number of results for a given status.
 */
fun countResultsByStatus(race: Race, status: String): Int {
    return race.results.count { it.status == status }
}

/**
 * Return the first driver you encounter who has a given nationality, or null if there is none.
 */
fun findDriverFrom(drivers: List<Driver>, nationality: String): Driver? {
    return drivers.find { it.nationality == nationality }
}