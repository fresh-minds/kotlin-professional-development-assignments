package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Create value classes for all fields of the [Book] and [Ebook] data classes. Move validation logic to
 * the respective value classes.
 */
data class Book(
    val title: String,
    val isbn: String,
    val publisher: String,
    val type: String = "hardcover"
) {
    init {
        require(title.isNotBlank()) { "title cannot be blank" }
        require(isbn.length == 10) { "isbn should have a length of 10" }
        require(publisher.isNotBlank()) { "publisher cannot be blank" }
        require(type.isNotBlank()) { "type cannot be blank" }
    }
}

data class Ebook(
    val title: String,
    val isbn: String,
    val publisher: String,
    val format: String = ".epub"
) {
    init {
        require(title.isNotBlank()) { "title cannot be blank" }
        require(isbn.length == 10) { "isbn should have a length of 10" }
        require(publisher.isNotBlank()) { "publisher cannot be blank" }
        require(format.isNotBlank()) { "format cannot be blank" }
    }
}
