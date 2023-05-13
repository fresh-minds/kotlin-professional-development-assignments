package nl.freshminds

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class Assignment02Test {

    @Test
    fun `publish succeeds for every message`() {
        val messages = listOf(
            "hello", "is", "it", "me", "you", "are", "looking", "for", "?"
        )

        val result = runBlocking {
            publishMessages(messages)
        }

        assertEquals(9, result.size)
        assertTrue { result.all { it.result == Result.SUCCESS } }
    }

    @Test
    fun `publish fails for every message`() {
        val messages = listOf(
            "hello is it me you are looking for?",
            "I can see it in your eyes, I can see it in your smile",
            "You're all I've ever wanted and my arms are open wide"
        )

        val result = runBlocking {
            publishMessages(messages)
        }

        assertEquals(3, result.size)
        assertTrue { result.all { it.result == Result.FAILURE } }
    }

    @Test
    fun `publishing happens concurrently`() {
        val messages = List(size = 1000) { it.toString() }

        val executionTime = runBlocking {
            measureTimeMillis {
                publishMessages(messages)
            }
        }

        // Should be close to 1000, but 2000 feels like a safe upper margin.
        assertTrue { executionTime < 2000 }
    }

}