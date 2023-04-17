package nl.freshminds

/**
 * Refactor [isPrime] to an extension function.
 */
fun isPrime(n: Int): Boolean {
    return (2 until n).none {n % it == 0}
}