package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Refactor [createTitle] so you can write it as a single expression function. Use the [apply] and [let]
 * scope functions your solution.
 *
 * 2. Use also [also] to log the result after every step in the processing chain.
 */
fun createTitle() = mutableListOf<String>().apply {
    add("The")
    add("Game")
    add("Of")
    add("Thrones")
}
    .also { println("After step 1: $it" ) }
    .joinToString(" ")
    .also { println("After step 2: $it" ) }
    .removePrefix("The ")
    .also { println("After step 3: $it" ) }
    .let { "'$it'" }
    .also { println("After step 4: $it" ) }

fun main() {
    createTitle()
}