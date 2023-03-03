package nl.freshminds

/**
 * Implement [convertToLongOrZero].
 *
 * Return 0 if [optionalNumber] is null, return the equivalent of [optionalNumber] as a Long otherwise
 */
fun convertToLongOrZero(optionalNumber: Int?): Long {
    return optionalNumber?.toLong() ?: 0
}
