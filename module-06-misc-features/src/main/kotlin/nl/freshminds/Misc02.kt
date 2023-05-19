package nl.freshminds

import nl.freshminds.Unit.*

/**
 * There are no tests available for this assignment.
 *
 * 1. Overload the plus(+), minus(-), and times(*) operators for the [Speed] class. These overloads should throw
 * an exception if they are applied to [Speed] objects of different units.
 *
 * 2. Initialize a couple of [Speed] objects and try to use the +, -, and * operators.
 */

data class Speed(val unit: Unit, val quantity: Int) {
    operator fun plus(other: Speed): Speed {
        if (this.unit != other.unit) {
            error("Incompatible units of ${this.unit} and ${other.unit}")
        }

        return Speed(this.unit, this.quantity + other.quantity)
    }

    operator fun minus(other: Speed): Speed {
        if (this.unit != other.unit) {
            error("Incompatible units of ${this.unit} and ${other.unit}")
        }

        return Speed(this.unit, this.quantity - other.quantity)
    }

    operator fun times(other: Speed): Speed {
        if (this.unit != other.unit) {
            error("Incompatible units of ${this.unit} and ${other.unit}")
        }

        return Speed(this.unit, this.quantity * other.quantity)
    }

}

fun main() {
    val mps1 = Speed(METERS_PER_SECOND, 5)
    val mps2 = Speed(METERS_PER_SECOND, 3)
    println(mps1 + mps2)
    println(mps1 - mps2)
    println(mps1 * mps2)

    val kph = Speed(KILOMETRES_PER_HOUR, 100)
    val mph = Speed(MILES_PER_HOUR, 60)
    println(kph + mph)
}

enum class Unit {
    METERS_PER_SECOND,
    KILOMETRES_PER_HOUR,
    MILES_PER_HOUR,
}
