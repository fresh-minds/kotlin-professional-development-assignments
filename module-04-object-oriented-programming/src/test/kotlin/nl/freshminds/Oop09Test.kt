package nl.freshminds

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Oop09Test {
    @Test
    fun `create instances of Rocket class`() {
        val rocket1 = Rocket(name = "Big Rocket", fuelType = "Electric", engineCount = 3)
        assertEquals("Big Rocket", rocket1.name)
        assertEquals("Electric", rocket1.fuelType)
        assertEquals(3, rocket1.engineCount)

        val rocket2 = Rocket(name = "Big Rocket", fuelType = "Electric")
        assertEquals("Big Rocket", rocket2.name)
        assertEquals("Electric", rocket2.fuelType)
        assertEquals(1, rocket2.engineCount)

        val rocket3 = Rocket(name = "Big Rocket", engineCount = 3)
        assertEquals("Big Rocket", rocket3.name)
        assertEquals("Liquid Oxygen", rocket3.fuelType)
        assertEquals(3, rocket3.engineCount)

        val rocket4 = Rocket(name = "Big Rocket")
        assertEquals("Big Rocket", rocket4.name)
        assertEquals("Liquid Oxygen", rocket4.fuelType)
        assertEquals(1, rocket4.engineCount)
    }
}