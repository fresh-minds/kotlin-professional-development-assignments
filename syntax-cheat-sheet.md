# Syntax Cheat Sheet

## Basics

### Program entry point

```kotlin
fun main(args: Array<String>) {
    println("Fresh Minds!")
}

// args can be omitted
fun main() {
    println("Fresh Minds!")
}
```

### Declaring a function

```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

// Single expression function
fun sum(a: Int, b: Int) = a + b

// A function that doesn't return anything
fun printSum(a: Int, b: Int): Unit {
    println("The sum of $a + $b is ${a + b}")
}

// Unit return type can be omitted
fun printSum(a: Int, b: Int) {
    println("The sum of $a + $b is ${a + b}")
}
```

### Declaring variables

```kotlin
val firstName: String = "Bas" // Read only variable
var age: Int = 31             // Mutable variable
val lastName = "de Groot"     // Declaring a variable with type inference
val weight: Double? = null    // Declaring a nullable type 
```

## Working with nullable types

```kotlin
val name: String? = null

// Prints length or null
println(name?.length)

// Prints name.length or default of 5
println(name?.length ?: 5)

// Prints length or throws a NullPointerException
println(name!!.length)
```

## Control flow

### If expression

```kotlin
if (a > b) {
    println("a is greater than b")
} else {
    println("b is greater than or equal to a")
}

// If can be used as an expression
val max = if (a > b) {
    a
} else {
    b
}
```

### When expression

```kotlin
val x: Number = 10
val message = when (x) {
    0 -> "x is zero"                                // Equality check
    in 1..4 -> "x is between 1 and 4 (inclusive)"   // Range check
    5, 6 -> "x is five or six"                      // Multiple values
    is Long -> "x is a Long"                        // Type check
    else -> "x is some number"
}

// When expression with predicates
fun pastPresentOrFuture(date: LocalDate, today: LocalDate) = when {
    date.isBefore(today) -> "Past"
    date.isEqual(today) -> "Present"
    else -> "Future"
}
```

### For loops

```kotlin
for (i in 1..100) {
    println(i)
}

for (i in 100 downTo 0 step 2) {
    println(i)
}

// Range combined with forEach
(1..100).forEach { i -> println(i) }

repeat(10) { i -> println(i) }
```

### While loops

```kotlin
// checks the condition and then executes the body
while (x > 0) {
    x--
}

// executes the body and then checks the condition
do {
    val y = fetchData()
} while (y != null)
```

## Collections

### Creating collections

```kotlin
listOf(1, 2, 3)
mutableListOf(1, 2, 3)

setOf(1, 2, 3)
mutableSetOf(1, 2, 3)

arrayOf(1, 2, 3)

mapOf(1 to "one", 2 to "two")
mutableMapOf(1 to "one", 2 to "two")

sequenceOf(1, 2, 3)
```

### Collection processing

```kotlin
listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    .filter { it % 2 == 0 } // only even numbers
    .map { it * 5 }         // multiply number by 5
    .take(3)                // take first 3
    .sum()                  // calculate sum
```