package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Write a higher order extension function on [List<Int>] named [printIf]. The function should
 * accept a [predicate] function of Int -> Boolean. The implementation should print all integers that
 * match the predicate.
 *
 * 2. Refactor [printIf] so it works with all types of lists. In other words, make it an extension on [List<T>].
 *
 * 3. Write a main function and invoke printIf a couple of times on different types of lists
 */

fun <T> List<T>.printIf(predicate: (T) -> Boolean) {
    forEach { element ->
        if (predicate(element)) {
            println(element)
        }
    }
}

fun main() {
    listOf(1, 2, 3, 4, 5, 6)
        .printIf { it % 2 == 0 }

    listOf('A', 'a', 'b', 'C')
        .printIf { it.isUpperCase() }
}
