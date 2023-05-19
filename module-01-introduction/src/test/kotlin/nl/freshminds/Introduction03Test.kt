package nl.freshminds

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Introduction03Test {

    @Test
    fun `largest palindromic number made from the product of two 3-digit numbers`() {
        assertEquals(906609, palindromicNumber())
    }
}