package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Assignment01Test {

    @Test
    fun `a simple test for convertToLong`() {
        assertEquals(0, convertToLongOrZero(null))
        assertEquals(2147483647, convertToLongOrZero(Int.MAX_VALUE))
        assertEquals(-2147483648, convertToLongOrZero(Int.MIN_VALUE))
    }
}