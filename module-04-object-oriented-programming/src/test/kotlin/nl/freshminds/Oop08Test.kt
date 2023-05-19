package nl.freshminds

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDate

class Oop08Test {
    @Test
    fun `discount validations`() {
        val today = LocalDate.now()
        val tomorrow = today.plusDays(1)
        val discount = Discount(
            title = "Big Sale",
            startDate = today,
            endDate = tomorrow,
            code = "ASDFGJKLAA",
            percentage = 50
        )

        assertThrows(IllegalArgumentException::class.java) { discount.copy(title = " ") }
        assertThrows(IllegalArgumentException::class.java) { discount.copy(startDate = tomorrow, endDate = today) }
        assertThrows(IllegalArgumentException::class.java) { discount.copy(code = "abc") }
        assertThrows(IllegalArgumentException::class.java) { discount.copy(percentage = 0) }
    }
}