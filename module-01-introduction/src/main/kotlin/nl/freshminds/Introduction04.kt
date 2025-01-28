package nl.freshminds

/**
 * 2520 is the smallest number that can be divided by each number from 1 to 10 without any remainder.
 *
 * Implement [divisibleByAllNumbersFrom1to20] to find the smallest number that is divisible by each number from
 * 1 to 20 without any remainder.
 */
fun divisibleByAllNumbersFrom1to20(): Int {
    var number = 1
    while (true) {
        if (divisible(number)) {
            println(number)
            break
        }
        number++
    }
    return number
}

private fun divisible(number: Int): Boolean {
    for (i in 1..20) {
        if (number % i != 0) {
            return false
        }
    }
    return true
}