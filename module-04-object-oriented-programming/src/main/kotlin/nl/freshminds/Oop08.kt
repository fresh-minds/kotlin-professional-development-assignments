package nl.freshminds

import java.time.LocalDate

/**
 * Write some validations for this Discount class using 'init' + 'require'.
 *
 * Requirements:
 * - title cannot be an empty or blank string
 * - startDate cannot be after the endDate
 * - code should have a length of exactly 10
 * - percentage can have a value from 1 to 100 (inclusive)
 */
data class Discount(
    val title: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val code: String,
    val percentage: Int
) {
    init {
        require(title.isNotBlank()) { "title cannot be blank" }
        require(startDate.isBefore(endDate)) { "startDate cannot be after endDate" }
        require(code.length == 10) { "code should have a length of 10" }
        require(percentage in 1..100) { "percentage should have a value from 1 to 100 (inclusive)" }
    }
}