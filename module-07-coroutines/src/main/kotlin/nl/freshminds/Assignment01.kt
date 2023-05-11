package nl.freshminds

import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

/**
 * There are no tests available for this assignment.
 *
 * 1. Call [suspendingPrintThread] from the main function
 *
 * 2. Launch 10000 [suspendingPrintThread] coroutines concurrently
 *
 * 3. Try passing different dispatchers to 'launch' and observe the results
 *
 * 4. Replace [delay] by [Thread.sleep] in [suspendingPrintThread] and observe the results
 */

fun main() {

}

suspend fun suspendingPrintThread() {
    delay(1.seconds)
    println(Thread.currentThread().name)
}
