package nl.freshminds

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Assignment03Test {

    @Test
    fun `count results by status`() {
        assertEquals(11, countResultsByStatus(F1DataSet.races.first(), "Finished"))
        assertEquals(5, countResultsByStatus(F1DataSet.races.first(), "+1 Lap"))
        assertEquals(1, countResultsByStatus(F1DataSet.races.first(), "+2 Laps"))
        assertEquals(1, countResultsByStatus(F1DataSet.races.first(), "Mechanical"))
        assertEquals(1, countResultsByStatus(F1DataSet.races.first(), "Engine"))
        assertEquals(1, countResultsByStatus(F1DataSet.races.first(), "Electrical"))
    }

    @Test
    fun `find driver from`() {
        assertEquals("Verstappen", findDriverFrom(F1DataSet.drivers, "Dutch")?.familyName)
        assertEquals("Hamilton", findDriverFrom(F1DataSet.drivers, "British")?.familyName)
        assertNull(findDriverFrom(F1DataSet.drivers, "Honolulu"))
    }
}