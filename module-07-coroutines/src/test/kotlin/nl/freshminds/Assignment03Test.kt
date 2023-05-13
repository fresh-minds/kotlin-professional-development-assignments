package nl.freshminds

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis
import org.junit.jupiter.api.Assertions.assertTrue

class Assignment03Test {

    @Test
    fun `processStockUpdateEvent should take around 5 seconds`() {
        val executionTime = runBlocking {
            measureTimeMillis {
                processStockUpdateEvent(StockUpdateEvent(1, 500))
            }
        }

        assertTrue(executionTime in 5000..6000) {
            "Execution time should be between 5000ms and 6000ms but found ${executionTime}ms"
        }
    }
}