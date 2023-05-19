package nl.freshminds

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Collections02Test {

    @Test
    fun `check if all races are from a given season`() {
        assertTrue(checkAllRacesAreFromSeason(F1DataSet.races, 2023))
        assertFalse(checkAllRacesAreFromSeason(F1DataSet.races, 1999))
    }

    @Test
    fun `has driver with given nationality`() {
        assertTrue(hasDriverWithNationality(F1DataSet.drivers, "Dutch"))
        assertTrue(hasDriverWithNationality(F1DataSet.drivers, "Mexican"))
        assertTrue(hasDriverWithNationality(F1DataSet.drivers, "British"))
        assertTrue(hasDriverWithNationality(F1DataSet.drivers, "German"))
        assertFalse(hasDriverWithNationality(F1DataSet.drivers, "Italian"))
    }
}
