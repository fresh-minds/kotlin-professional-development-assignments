package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * [HttpClient.get] returns a 200 success status code about 25% of the time.
 * [HttpClient.post] returns a 200 success status code about 10% of the time.
 *
 * Write a HOF retryUntilSuccess that keeps retrying either [HttpClient.get] or [HttpClient.post]
 * until the call is successful or the specified max attempts has been reached. Upon reaching the max retry
 * attempts an exception is thrown.
 *
 * Example usage:
 * ```kotlin
 * retryUntilSuccess(10) { HttpClient.get() }
 * retryUntilSuccess(20) { HttpClient.post() }
 * ```
 */

object HttpClient {
    fun get() = if ((1..1000).random() > 750) 200 else 500
    fun post() = if ((1..1000).random() > 900) 200 else 500
}
