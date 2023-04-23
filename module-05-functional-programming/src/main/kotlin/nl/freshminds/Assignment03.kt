package nl.freshminds

/**
 * The updates in [updateDatabase] happen in a transaction. Having to write this transaction logic every
 * time is tedious and error-prone.
 *
 * Write a HOF named [executeInTransaction] that extracts the transaction logic. In the end you should be able to
 * refactor [updateDatabase] to this:
 *
 * ```kotlin
 * fun updateDatabase() = executeInTransaction {
 *     saveName("Fresh Minds")
 *     saveAge(3)
 *     saveCity("Leiden")
 * ```
 */

fun updateDatabase(): String {
    TransactionManager.begin()
    return try {
        saveName("Fresh Minds")
        saveAge(3)
        saveCity("Leiden")
        TransactionManager.commit()
    } catch (exception: Exception) {
        TransactionManager.rollback()
    }
}

// Some functions to update our imaginary database.
fun saveName(name: String) = if ((1..1000).random() > 300) name else error("failed to save name")
fun saveAge(age: Int) = if ((1..1000).random() > 200) age else error("failed to save age")
fun saveCity(city: String) = if ((1..1000).random() > 100) city else error("failed to save city")

// A dummy transaction manager
object TransactionManager {
    fun begin() = println("begin")
    fun commit() = "commit"
    fun rollback() = "rollback"
}