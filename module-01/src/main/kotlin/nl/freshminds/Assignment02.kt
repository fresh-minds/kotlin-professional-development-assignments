package nl.freshminds

/**
 * Implement the [fizzBuzz] function so that the tests in 'Assignment02Test.kt' pass.
 *
 * Requirements:
 * - Return "Fizz" if [input] is a multiple of 3
 * - Return "Buzz" if [input] is a multiple of 5
 * - Return "FizzBuzz" if [input] is a multiple of both 3 and 5
 * - Return the value of [input] as a String when it's not a multiple of 3 or 5
 */
fun fizzBuzz(input: Int): String {
    return when {
        input % 15 == 0 -> "FizzBuzz"
        input % 5 == 0 -> "Buzz"
        input % 3 == 0 -> "Fizz"
        else -> input.toString()
    }
}

/**
 * Implement the function below to print [n] FizzBuzz numbers to the console (starting from 1).
 */
fun printFizzBuzzNumbers(n: Int) {
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}
