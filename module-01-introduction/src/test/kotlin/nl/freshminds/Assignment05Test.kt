package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Assignment05Test {

    @Test
    fun `calculate the first n fibonacci numbers`() {
        cases.forEach { case ->
            val result = fibonacci(case.key)
            assertEquals(case.value, result) { "Failed for input n = ${case.key}" }
        }
    }

    private val cases = mapOf(
        1 to "0",
        2 to "0,1",
        3 to "0,1,1",
        4 to "0,1,1,2",
        10 to "0,1,1,2,3,5,8,13,21,34",
        11 to "0,1,1,2,3,5,8,13,21,34,55",
        18 to "0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597"
    )
}

