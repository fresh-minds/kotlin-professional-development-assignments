package nl.freshminds

/**
 * Find the amount of races held in the 2023 season.
 */
fun amountOfRacesIn2023(races: List<Race>): Int {
    return races.count { it.season == 2023 }
}

/**
 * Return a set of all unique circuit names.
 */
fun circuitNames(races: List<Race>): Set<String> {
    return races.map { it.circuit.circuitName }.toSet()
}
