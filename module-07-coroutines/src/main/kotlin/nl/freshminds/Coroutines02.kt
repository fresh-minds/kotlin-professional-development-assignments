package nl.freshminds

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

/**
 * Implement [publishMessages] to concurrently send all messages via [publishMessage] and map the result to a
 * [PublishResult].
 */

suspend fun publishMessages(messages: List<String>) = coroutineScope {
    messages.map { message ->
        async { PublishResult(publishMessage(message), message) }
    }.awaitAll()
}

data class PublishResult(
    val result: Result,
    val message: String
)

// Dummy publish function. Don't change this.
suspend fun publishMessage(message: String): Result {
    delay(1.seconds)
    return if (message.length > 10) Result.FAILURE else Result.SUCCESS
}

enum class Result {
    SUCCESS, FAILURE
}
