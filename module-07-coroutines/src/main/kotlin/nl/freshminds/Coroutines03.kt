package nl.freshminds

import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

/**
 * Implement [processStockUpdateEvent].
 *
 * Requirements:
 * - Update the database first and [fetchCustomersOnWaitingList] afterward (sequentially)
 * - Sent out the emails the customers concurrently
 * - The total execution time of the function should be a little over 5 seconds.
 */

suspend fun processStockUpdateEvent(stockUpdateEvent: StockUpdateEvent) {

}

suspend fun updateDatabase(productId: Int, amountInStock: Int) {
    delay(1.seconds)
    println("Updated stock of product $productId to $amountInStock")
}

suspend fun fetchCustomersOnWaitingList(productId: Int): List<CustomerId> {
    delay(2.seconds)
    return when(productId) {
        1 -> listOf(CustomerId("a"), CustomerId("b"), CustomerId("c"), CustomerId("d"))
        10 -> listOf(CustomerId("f"), CustomerId("g"))
        100 -> listOf(CustomerId("r"))
        else -> emptyList()
    }
}

suspend fun emailCustomer(customerId: CustomerId) {
    delay(2.seconds)
    println("Notified customer: ${customerId.value} via email")
}

data class StockUpdateEvent(val productId: Int, val amountInStock: Int)

@JvmInline
value class CustomerId(val value: String)