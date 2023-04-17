package nl.freshminds

/**
 * Refactor the [Rocket] data class. Use default arguments to get rid of the secondary constructors.
 */
data class Rocket(
    val name: String,
    val fuelType: String,
    val engineCount: Int
) {
    constructor(name: String): this(name, "Liquid Oxygen", 1)
    constructor(name: String, fuelType: String): this(name, fuelType, 1)
    constructor(name: String, engineCount: Int): this(name, "Liquid Oxygen", engineCount)
}