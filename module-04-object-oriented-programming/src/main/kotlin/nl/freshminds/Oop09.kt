package nl.freshminds

/**
 * Refactor the [Rocket] data class. Use default arguments to get rid of the secondary constructors.
 */
data class Rocket(
    val name: String,
    val fuelType: String = "Liquid Oxygen",
    val engineCount: Int = 1
)