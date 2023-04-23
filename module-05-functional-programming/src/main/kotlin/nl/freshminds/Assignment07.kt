package nl.freshminds

/**
 * 1. Refactor [createTitle] so you can write it as a single expression function. Use the [apply] and [let]
 * scope functions your solution.
 *
 * 2. Use also [also] to log the result after every step in the processing chain.
 */
fun createTitle(): String {
    val titleFragments = mutableListOf<String>()
    titleFragments.add("The")
    titleFragments.add("Game")
    titleFragments.add("Of")
    titleFragments.add("Thrones")

    val title = titleFragments.joinToString(" ")

    val titleWithoutPrefix = title.removePrefix("The ")

    return "'$titleWithoutPrefix'"
}
