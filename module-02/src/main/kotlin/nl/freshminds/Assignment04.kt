package nl.freshminds

import JavaQuoteGenerator

/**
 * Run the test in `Assignment04Test.kt` and confirm that it fails with a NPE.
 *
 * - Annotate [JavaQuoteGenerator.next] so Kotlin understands this method can return null.
 * - Refactor [callingAJavaApi] so it prints some default value whenever [JavaQuoteGenerator.next] returns null.
 *
 * Moral of the story: always be careful when invoking Java APIs
 */
fun callingAJavaApi() {
    for (i in 0..10) {
        val quote = JavaQuoteGenerator.next().uppercase()
        println(quote)
    }
}