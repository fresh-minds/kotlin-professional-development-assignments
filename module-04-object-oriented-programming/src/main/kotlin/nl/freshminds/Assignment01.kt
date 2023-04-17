package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Create an [Animal] class which accepts the following properties in the
 * primary constructor: name, age, and species.
 *
 * 2. Create a [Mammal] class which is a subclass of [Animal]. The [Mammal] class should have an
 * additional property for the type of mammal (e.g. carnivore, herbivore, etc.)
 *
 * 3. Create a [Bird] class which is a subclass of [Animal]. The [Bird] class should have an
 * additional property for the type of bird (e.g. raptor, waterfowl, etc.) and a property that specifies
 * if the given bird can fly.
 *
 * 4. Add a [calculateAverageLifeSpan] method to the [Animal] class. Which always returns 10.
 *
 * 5. Override [calculateAverageLifeSpan] in the [Mammal] subclass. It should return different values based on
 * the species. For example: Elephant=70, Lion=15, and Gorilla=35. If no logic is provided for a species
 * the method should return the result of the [calculateAverageLifeSpan] from the [Animal] superclass.
 *
 * 6. Override [calculateAverageLifeSpan] in the [Bird] subclass. It should return different values based on
 * the species. For example: Eagle=20, Swan=25, and Penguin=15. If no logic is provided for a species
 * the method should return the result of the [calculateAverageLifeSpan] from the [Animal] superclass.
 *
 * 7. Create a main function that creates several [Animal], [Mammal], and [Bird] objects.
 * Print out their name, age, species, and average lifespan.
 */
