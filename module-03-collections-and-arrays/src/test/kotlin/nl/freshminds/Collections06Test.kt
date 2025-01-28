package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Collections06Test {

    @Test
    fun `total amount of points awarded`() {
        val result = totalAmountOfPoints(F1DataSet.races.first())
        assertEquals(101, result)
    }

    @Test
    fun `top 3 drivers`() {
        val expected = listOf(
            "Max Verstappen",
            "Sergio Pérez",
            "Fernando Alonso"
        )

        assertEquals(expected, top3Drivers(F1DataSet.races.first()))
    }

    @Test
    fun `total amount of points for driver`() {
        val result = totalPointsForDriver("Verstappen", F1DataSet.races)
        assertEquals(138, result)
    }
}