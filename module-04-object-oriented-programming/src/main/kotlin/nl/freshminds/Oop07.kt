package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Create a data class named Actor with the following properties:
 *      name: a String representing the name of the actor
 *      role: a String representing the character played by the actor in the movie
 *
 * 2. Create a data class named Movie with the following properties:
 *      title: a String representing the title of the movie
 *      director: a String representing the name of the director of the movie
 *      year: an Int representing the year the movie was released
 *      genres: a List of String representing the genres the movie belongs to
 *      actors: a List of Actor representing the main actors in the movie
 *
 * 3. Add a main method and create a couple of Movie instances. Use the copy function to create
 * variations of these instances.
 */
data class Actor(
    val name: String,
    val role: String
)

data class Movie(
    val title: String,
    val director: String,
    val year: Int,
    val genres: List<String>,
    val actors: List<Actor>
)

fun main() {
    val avatar = Movie(
        title = "Avatar",
        director = "James Cameron",
        year = 2009,
        genres = listOf("ScienceFiction", "Adventure"),
        actors = listOf(
            Actor(
                name = "Sam Worthington",
                role = "Jake Sully"
            ),
            Actor(
                name = "Joel David Moore",
                role = "Norm Spellman"
            )
        )
    )

    val avatarSequel = avatar.copy(
        title = "Avatar: The Way of Water",
        year = 2022,
        actors = avatar.actors + Actor("Bailey Bass", "Tsireya")
    )

    println(avatar)
    println(avatarSequel)
}