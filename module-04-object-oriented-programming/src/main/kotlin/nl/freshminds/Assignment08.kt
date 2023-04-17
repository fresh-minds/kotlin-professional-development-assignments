package nl.freshminds

import java.time.LocalDate

/**
 * Write some validations for this Discount class using 'init' + 'require'.
 *
 * Requirements:
 * - title cannot be an empty or blank string
 * - startDate cannot be after the endDate
 * - code should have a length of exactly 10
 * - percentage should have a value between 1 and 100
 */
data class Discount(
    val title: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val code: String,
    val percentage: Int
)