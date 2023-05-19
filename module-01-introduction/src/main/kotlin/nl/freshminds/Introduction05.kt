package nl.freshminds

import java.util.StringJoiner

/**
 * In mathematics, the Fibonacci numbers, form a sequence, in which each number is the sum of the two preceding ones.
 * Starting from 0 and 1, the first 10 values in the sequence are:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 *
 * Implement [fibonacci] to return a comma separated String of the first [n] fibonacci numbers.
 */
fun fibonacci(n: Int): String {
   var t1 = 0
   var t2 = 1

   val joiner = StringJoiner(",")
   for (i in 1..n) {
      joiner.add(t1.toString())
      val sum = t1 + t2
      t1 = t2
      t2 = sum
   }
   return joiner.toString()
}