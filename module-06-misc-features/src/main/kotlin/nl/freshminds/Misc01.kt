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
        inline fun <reified T> create(queue: String): Subscriber<T> {
            return Subscriber(queue, T::class.java)
        }
    }
}

fun main() {
    val priceSubscriber = Subscriber.create<PriceChanged>("price-changes")
    val stockSubscriber = Subscriber.create<StockUpdated>("stock-updates")
}

object PriceChanged
object StockUpdated