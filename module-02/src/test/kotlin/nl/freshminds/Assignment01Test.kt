package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Assignment01Test {

    @Test
    fun `a simple test for convertToLong`() {
        assertEquals(0, convertToLong(null))
        assertEquals(2147483647, convertToLong(Int.MAX_VALUE))
        assertEquals(-2147483648, convertToLong(Int.MIN_VALUE))
    }
}