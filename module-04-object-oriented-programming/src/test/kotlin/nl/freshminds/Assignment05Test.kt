package nl.freshminds

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.math.exp

class Assignment05Test {

    @Test
    fun `isBetween extension function`() {
        val today = LocalDate.now()
        val yesterday = today.minusDays(1)
        val tomorrow = today.plusDays(1)

        // TODO uncomment this assert after implementing the extension function
//         assertTrue(today.isBetween(yesterday, tomorrow))
    }

    @Test
    fun `squareNumbers extension function`() {
        val input = listOf(1, 2, 3, 4, 5)
        val expected = listOf(1, 4, 9, 16, 25)

        // TODO uncomment this assert after implementing the extension function
//         assertEquals(expected, input.squareNumbers())
    }

    @Test
    fun `isPalindrome extension function`() {
        // TODO uncomment these asserts after implementing the extension function
//        assertTrue("racecar".isPalindrome())
//        assertTrue("radar".isPalindrome())
//        assertTrue("civic".isPalindrome())
//        assertFalse("pancakes".isPalindrome())
//        assertFalse("hello".isPalindrome())
    }

    @Test
    fun `capitalizeWords extension function`() {
        // TODO uncomment these asserts after implementing the extension function
//        assertEquals("Hello World", "hello world".capitalizeWords())
//        assertEquals("This Is Amazing", "this is amazing".capitalizeWords())
    }
}