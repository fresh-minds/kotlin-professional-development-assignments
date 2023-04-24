package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Refactor [create] to make use of reified generics, so it is no longer necessary to pass in the [eventType]
 * as an argument.
 */
class Subscriber<T>(
    val queue: String,
    val eventType: Class<T>
) {
    companion object {
        fun <T> create(queue: String, eventType: Class<T>): Subscriber<T> {
            return Subscriber(queue, eventType)
        }
    }
}

fun main() {
    val priceSubscriber = Subscriber.create("price-changes", PriceChanged::class.java)
    val stockSubscriber = Subscriber.create("stock-updates", StockUpdated::class.java)
}

object PriceChanged
object StockUpdated