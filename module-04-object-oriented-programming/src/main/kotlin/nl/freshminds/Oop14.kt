package nl.freshminds

import java.math.BigDecimal

/**
 * 1. Create a new data class [Pizza] with a few properties like [name], [size], [toppings], and [price].
 *
 * 2. Implement a companion object within the Pizza class that contains several factory methods for
 * creating different types of pizzas.
 *
 * Implement a factory method createCheesePizza() that creates a cheese pizza and returns it.
 * Implement a factory method createPepperoniPizza() that creates a pepperoni pizza and returns it.
 * Implement a factory method createVeggiePizza() that creates a vegetarian pizza and returns it.
 *
 * 3. Test your implementation by creating a few pizzas using each of the factory methods.
 * Verify that the pizzas are created correctly with the appropriate properties.
 *
 * 4. Mark the Pizza constructor as private so all pizza creation goes through the
 * companion object's factory methods.
 */

@ConsistentCopyVisibility
data class Pizza private constructor(
    val name: String,
    val size: Int,
    val toppings: List<String>,
    val price: BigDecimal
) {
    companion object {
        fun createCheesePizza() = Pizza(
            name = "4 Fromaggi",
            size = 30,
            toppings = listOf("Cheese", "Cheese", "Cheese"),
            price = BigDecimal.TEN
        )

        fun createPepperoniPizza() = Pizza(
            name = "Pepperoni",
            size = 35,
            toppings = listOf("Pepperoni", "Mushrooms", "Cheese"),
            price = BigDecimal("12.34")
        )

        fun createVeggiePizza() = Pizza(
            name = "Veggie",
            size = 15,
            toppings = listOf("Mushrooms", "Carrots", "Broccoli"),
            price = BigDecimal("2.50")
        )
    }
}

fun main() {
    println(Pizza.createCheesePizza())
    println(Pizza.createPepperoniPizza())
    println(Pizza.createVeggiePizza())
}