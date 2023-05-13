package nl.freshminds

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class Assignment01Test {

    @Test
    fun `total amount of races in the 2023 season`() {
        assertEquals(3, amountOfRacesIn2023(F1DataSet.races))
    }

    @Test
    fun `all unique circuit names`() {
        assertEquals(
            setOf(
                "Bahrain International Circuit",
                "Jeddah Corniche Circuit",
                "Albert Park Grand Prix Circuit"
            ), circuitNames(F1DataSet.races)
        )
    }
}