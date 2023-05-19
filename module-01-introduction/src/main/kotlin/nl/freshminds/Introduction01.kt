package nl.freshminds

/**
 * A: Write a main function which prints some text to the console.
 *
 * B: Write a function 'sumTimesFive' that takes the sum of 2 integers and multiplies the result by 5.
 *
 * C: Call this function from your main function and print the result to the console.
 *
 * D: Are you able to write the `sumTimesFive` function as a single expression function?
 */
fun main() {
    val result = sumTimesFive(2, 3)
    println("Result of sumTimesFive = $result")
}

private fun sumTimesFive(a: Int, b: Int) = (a + b) * 5