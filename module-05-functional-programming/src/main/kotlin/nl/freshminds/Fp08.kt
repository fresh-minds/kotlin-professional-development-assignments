package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Refactor [processOrder] make use of a safe-call and scope function instead of the if statement.
 */
fun processOrder(payment: Payment?) {
    payment?.let { shipOrder(it) } ?: throw IllegalArgumentException("invalid payment")
}

fun shipOrder(payment: Payment): Unit = TODO("No need to implement this")

object Payment