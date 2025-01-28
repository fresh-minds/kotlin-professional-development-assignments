package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Create an infix function [isMultipleOf] that takes two integers as arguments and returns true
 * if the first integer is a multiple of the second integer.
 *
 * 2. Create a class Student with two properties: name (String) and grade (Int). Create an infix function
 * [higherGradeThan] that takes two Student objects as arguments and returns true if the first student's
 * grade is higher than the second student's grade.
 *
 * 3. Create a main function and give your infix functions a try.
 */

infix fun Int.isMultipleOf(other: Int): Boolean {
    return this % other == 0
}

data class Student(val name: String, val grade: Int) {
    infix fun higherGradeThan(other: Student) = this.grade > other.grade
}

fun main() {
    println(10 isMultipleOf 5)
    println(11 isMultipleOf 5)

    val student1 = Student("Bas", 1)
    val student2 = Student("Bob", 9)

    println(student1 higherGradeThan student2)
    println(student2 higherGradeThan student1)
}