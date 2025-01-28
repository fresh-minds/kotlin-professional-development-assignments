package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Create value classes for all fields of the [Book] and [Ebook] data classes. Move validation logic to
 * the respective value classes.
 */
data class Book(
    val title: Title,
    val isbn: Isbn,
    val publisher: Publisher,
    val type: Type = Type("hardcover")
)

data class Ebook(
    val title: Title,
    val isbn: Isbn,
    val publisher: Publisher,
    val format: Format = Format(".epub")
)

@JvmInline
value class Title(val value: String) {
    init {
        require(value.isNotBlank()) { "title cannot be blank" }
    }
}

@JvmInline
value class Isbn(val value: String) {
    init {
        require(value.length == 10) { "isbn should have a length of 10" }
    }
}

@JvmInline
value class Publisher(val value: String) {
    init {
        require(value.isNotBlank()) { "publisher cannot be blank" }
    }
}

@JvmInline
value class Format(val value: String) {
    init {
        require(value.isNotBlank()) { "format cannot be blank" }
    }
}

@JvmInline
value class Type(val value: String) {
    init {
        require(value.isNotBlank()) { "type cannot be blank" }
    }
}