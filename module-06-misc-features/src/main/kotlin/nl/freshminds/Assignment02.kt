package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Overload the plus(+), minus(-), and times(*) operators for the [Speed] class. These overloads should throw
 * an exception if they are applied to [Speed] objects of different units.
 *
 * 2. Initialize a couple of [Speed] objects and try to use the +, -, and * operators.
 */

data class Speed(val unit: Unit, val quantity: Int)

enum class Unit {
    METERS_PER_SECOND,
    KILOMETRES_PER_HOUR,
    MILES_PER_HOUR,
}
