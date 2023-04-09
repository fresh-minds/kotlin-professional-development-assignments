package nl.freshminds

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Assignment07Test {

    @Test
    fun `average lap in which the fastest lap was set`() {
         assertEquals(37.5, averageLapInWhichADriverSetTheirFastestLap(F1DataSet.races.first()))
    }

    @Test
    fun `driver with shortest given name`() {
        assertEquals("Lewis", driverWithShortestGivenName("British", F1DataSet.drivers))
        assertNull(driverWithShortestGivenName("Swiss", F1DataSet.drivers))
    }
}