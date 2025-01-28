package nl.freshminds

/**
 * Return the total amount of points awarded in this race.
 */
fun totalAmountOfPoints(race: Race): Int {
    return race.results.sumOf { it.points }
}

/**
 * Return the full names (givenName + familyName) of the top 3 drivers from this race.
 */
fun top3Drivers(race: Race): List<String> {
    return race.results
        .sortedByDescending { it.points }
        .take(3)
        .map { "${it.driver.givenName} ${it.driver.familyName}" }
}

/**
 * Return the total amount of points scored by a given driver.
 */
fun totalPointsForDriver(familyName: String, races: List<Race>): Int {
    return races.flatMap { it.results }
        .filter { it.driver.familyName == familyName }
        .sumOf { it.points }
}