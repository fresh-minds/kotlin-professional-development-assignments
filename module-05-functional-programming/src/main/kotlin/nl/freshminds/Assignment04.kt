package nl.freshminds

import java.util.UUID

/**
 * There are no tests available for this assignment.
 *
 * Note: This can be a tricky question. If you get stuck, ask for help or move on to the next one.
 *
 * Write a generic function called [memoize] that takes in a function 'T -> R' and returns a memoized
 * version of the function.
 *
 * The memoized function should cache the results of previous calls and return the cached result if the same input
 * is given again.
 *
 * Uncomment the main function to validate your solution.
 */

//fun main() {
//    val squareFn = memoize<Int, Int> {
//        Thread.sleep(2000) // Simulate a long execution time
//        it * it
//    }
//
//    println(squareFn(5))
//    println(squareFn(10))
//    println(squareFn(5))
//    println(squareFn(10))
//
//    val uuidFromSeed = memoize<String, UUID> {
//        Thread.sleep(3000)
//        UUID.nameUUIDFromBytes(it.toByteArray())
//    }
//
//    println(uuidFromSeed("abc"))
//    println(uuidFromSeed("def"))
//    println(uuidFromSeed("abc"))
//    println(uuidFromSeed("def"))
//}