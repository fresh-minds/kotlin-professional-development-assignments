package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Assignment05Test {

    @Test
    fun `group constructors by nationality`() {
        val result = groupConstructorsByNationality(F1DataSet.races.first().results)

        assertEquals(listOf("Aston Martin", "Williams", "McLaren"), result["British"])
    }

    @Test
    fun `partition by status`() {
        val result = partitionByStatus(F1DataSet.races.first().results)

        assertEquals(11, result.first.size)
        assertEquals(9, result.second.size)
    }
}