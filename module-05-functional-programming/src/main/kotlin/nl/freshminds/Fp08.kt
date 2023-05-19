package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Refactor [processOrder] make use of a safe-call and scope function instead of the if statement.
 */
fun processOrder(payment: Payment?) {
    if (payment != null) {
        shipOrder(payment)
    } else {
        throw IllegalArgumentException("invalid payment")
    }
}

fun shipOrder(payment: Payment): Unit = TODO()

object Payment