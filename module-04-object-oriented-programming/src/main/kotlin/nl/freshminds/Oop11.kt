package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * Implement [isHerbivore] so it returns true if the provided [dinosaur] is a herbivore, and false otherwise.
 * The implementation should be "compile time safe" in a way where adding a new [Dinosaur] to the enum should
 * result in compilation failure until this new case is accounted for.
 *
 * Bonus points: Write [isHerbivore] as a single expression function.
 * Bonus points: Refactor [isHerbivore] to an extension function.
 */
fun isHerbivore(dinosaur: Dinosaur): Boolean {
    TODO()
}

enum class Dinosaur {
    STEGOSAURUS,
    TRICERATOPS,
    TYRANNOSAURUS_REX
}
