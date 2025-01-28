package nl.freshminds

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 * numbers is 9009 = 91 × 99.
 *
 * Implement [palindromicNumber] to find the largest palindrome made from the product of two 3-digit numbers.
 */
fun palindromicNumber(): Int {
    var highest = 0
    for (i in 100..999) {
        for (j in 100..999) {
            val result = i * j
            if (result.toString() == result.toString().reversed()) {
                highest = if (highest < result) result else highest
            }
        }
    }
    return highest
}