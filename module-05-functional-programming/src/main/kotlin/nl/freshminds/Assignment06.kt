package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Write a function [prettyPrint] which accepts [company] as an argument. This function should print all
 * properties of [Company] in a format which you think looks good. Use the [with] scope function
 * in your solution.
 */

data class Company(
    val name: String,
    val amountOfEmployees: Int,
    val city: String,
    val country: String
)