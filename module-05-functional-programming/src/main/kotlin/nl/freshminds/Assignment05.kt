package nl.freshminds

import java.util.UUID

/**
 * There are no tests available for this assignment.
 *
 * Note: This can be a tricky question. If you get stuck, ask for help or move on to the next one.
 *
 * 1. Write an extension function on [Either<A,B>] called [mapLeft] which accepts a function as an argument of type
 * (A) -> C. [mapLeft] maps the value of [Either.Left] by applying the function to [Either.Left] instances. If the
 * instance is [Either.Right] don't apply any mapping. The return type of [mapLeft] should be [Either<C, B>].
 *
 * 2. Write an extension function on [Either<A,B>] called [fold] which accepts 2 functions as arguments. The first
 * is called [ifLeft] of type (A) -> Unit, the second is called [ifRight] of type (B) -> Unit. Invoke [ifLeft] if
 * you are dealing with an instance of [Either.Left] and invoke [Either.Right] if you have an instance of [Either.Right].
 *
 *  Uncomment the main function to validate your solution.
 */

fun <A, B, C> Either<A, B>.mapLeft(block: (A) -> C): Either<C, B> {
    return when(this) {
        is Either.Left -> Either.Left(block(value))
        is Either.Right -> this
    }
}

fun <A, B> Either<A, B>.fold(ifLeft: (A) -> Unit, ifRight: (B) -> Unit) {
    when(this) {
        is Either.Left -> ifLeft(value)
        is Either.Right -> ifRight(value)
    }
}

// The Either is a data type representing values of either A OR B. It can only be an instance of
// Either.Left or Either.Right.
sealed class Either<out A, out B> {
    data class Left<out A>(val value: A) : Either<A, Nothing>()
    data class Right<out B>(val value: B) : Either<Nothing, B>()
}

fun main() {
    createRandomEither()
        .mapLeft { "version = ${it.version()}, uuid = $it" }
        .fold(
            ifLeft = { println("Got a left with value: $it") },
            ifRight = { println("Got a right with value: $it") }
        )
}

fun createRandomEither() = if ((0..1000).random() > 500) {
    Either.Left(UUID.randomUUID())
} else {
    Either.Right(404)
}
