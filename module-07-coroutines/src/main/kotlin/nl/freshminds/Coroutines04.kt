package nl.freshminds

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext
import kotlin.time.Duration.Companion.seconds

/**
 * There are no tests available for this assignment.
 *
 * 1. Implement a function [parallelMap] as an extension function on [Iterable<T>]. It should work the same as the
 * normal [map] function but instead of doing the mapping operations sequentially they happen concurrently.
 *
 * 2. Add an extra argument to [parallelMap] that allows you to specify the [CoroutineContext]. The coroutines
 * should run in this context. (Hint: you can do this via [withContext]).
 */

suspend fun <T, R> Iterable<T>.parallelMap(
    context: CoroutineContext = Dispatchers.Default,
    transform: suspend (T) -> R
): List<R> {
    return withContext(context) {
        map { async { transform(it) } }.awaitAll()
    }
}

fun main() {
    runBlocking {
        (1..1000).parallelMap { addPrefix("foo", it) }
            .also { println(it) }
    }
}

suspend fun addPrefix(prefix: String, number: Int): String {
    delay(1.seconds)
    return "$prefix-$number"
}
