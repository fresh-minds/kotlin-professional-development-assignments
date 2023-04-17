package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Create a [Camera] interface with 2 methods: [takePicture] and [autoAdjustWhiteBalance]
 *
 * 2. Create a class [Iphone] which accepts a property [type] (11, 12, 13, etc) in the primary constructor.
 *
 * 3. Make [Iphone] implement [Camera]. For the implementations just print some text to the console. For example:
 * "Took picture with an Iphone 13" or "Auto adjusted white balance on the Iphone 12".
 *
 * 4. Create a class [Dslr] which accepts a property [model] (Canon D600, Nikon D7500, etc)
 *
 * 5. Make [Dslr] implement the [Camera] interface.
 *
 * 6. Define a main function and create a list of cameras by creating different variants of [Iphone] and [Dslr].
 * Loop over each element in this list and call both [takePicture] and [autoAdjustWhiteBalance] for each element.
 */
interface Camera {
    fun takePicture()
    fun autoAdjustWhiteBalance()
}

class Iphone(private val type: String): Camera {
    override fun takePicture() = println("Took picture with an Iphone $type")

    override fun autoAdjustWhiteBalance() = println("Auto adjusted white balance on Iphone $type")
}

class Dslr(private val model: String) : Camera {
    override fun takePicture() = println("Took picture with an $model")

    override fun autoAdjustWhiteBalance() = println("Auto adjusted white balance on $model")
}

fun main() {
   listOf(
        Iphone("11"),
        Iphone("12"),
        Iphone("13"),
        Dslr("Canon D600"),
        Dslr("Nikon D7500")
    ).forEach { camera ->
       camera.autoAdjustWhiteBalance()
       camera.takePicture()
   }
}