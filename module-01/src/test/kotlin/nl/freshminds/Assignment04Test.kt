package nl.freshminds

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Assignment04Test {

    @Test
    fun `divisible from 1 to 20`() {
        assertEquals(232792560, divisibleByAllNumbersFrom1to20())
    }
}