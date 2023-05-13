package nl.freshminds

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class Assignment06Test {

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
        assertEquals(69, result)
    }
}