package nl.freshminds

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis
import kotlin.test.assertTrue

class Assignment03Test {

    @Test
    fun `processStockUpdateEvent should take around 5 seconds`() {
        val executionTime = runBlocking {
            measureTimeMillis {
                processStockUpdateEvent(StockUpdateEvent(1, 500))
            }
        }

        assertTrue(message = "Execution time should be between 5000ms and 6000ms but found ${executionTime}ms") {
            executionTime in 5000..6000
        }
    }
}