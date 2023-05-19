package nl.freshminds

/**
 * 1. Add a [JuniorMechanic] class which implements the [Mechanic] interface.
 *
 * 2. Add a [SensiorMechanic] class which implements the [Mechanic] interface by delegating to the
 * [JuniorMechanic].
 *
 * 3. Override the implementation of [swapEngine] in the [SeniorMechnic] class.
 *
 * 4. Add a main function and create an instance of the [JuniorMechanic] and [SensiorMechanic]. Try to call
 * the functions defined in the [Mechanic] interface.
 */

interface Mechanic {
    fun changeTires()

    fun cleanCar()

    fun swapEngine()

    fun fixBoardComputer()
}

class SeniorMechanic(private val junior: JuniorMechanic) : Mechanic by junior {
    override fun swapEngine() = println("Senior swapping the engine")
}

class JuniorMechanic : Mechanic {
    override fun changeTires() = println("changing tires")

    override fun cleanCar() = println("cleaning car")

    override fun swapEngine() = println("swapping engine")

    override fun fixBoardComputer() = println("fixing board computer")
}

fun main() {
    val junior = JuniorMechanic()
    val senior = SeniorMechanic(junior)

    junior.changeTires()
    junior.cleanCar()
    junior.swapEngine()
    junior.fixBoardComputer()

    senior.changeTires()
    senior.cleanCar()
    senior.swapEngine()
    senior.fixBoardComputer()
}