package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Implement a singleton [IdGenerator]. It should hava single method [next] which returns the next random ID as a
 * String. Next accepts a single argument of [prefix] which is added to the generated ID as a prefix. If no [prefix]
 * is specified, it defaults to an empty string.
 *
 * 2. Add a main function and invoke the [next] method a couple of times and print the results.
 */

object IdGenerator {
    fun next(prefix: String = "") = prefix + (0..Int.MAX_VALUE).random()
}

fun main() {
    println(IdGenerator.next())
    println(IdGenerator.next(prefix = "abc"))
    println(IdGenerator.next(prefix = "123-"))
}
