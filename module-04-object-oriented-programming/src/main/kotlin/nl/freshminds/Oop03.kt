package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Refactor the [Service] class in such a way that the [restTemplate] can be declared as 'private val' instead
 * of 'private lateinit var'.
 */
class Service {
    private lateinit var restTemplate: RestTemplate

    fun doSomething() = restTemplate.fetch()
}

// Fake restTemplate. Do not change this.
class RestTemplate {
    fun fetch(): String = TODO()
}