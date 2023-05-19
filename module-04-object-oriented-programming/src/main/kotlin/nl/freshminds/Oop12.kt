package nl.freshminds

/**
 * There are no tests available for this assignment.
 *
 * 1. Define a sealed class [FileSystemNode] with two subclasses, [File] and [Directory].
 *
 * The [FileSystemNode] class should have a property name that represents the [name] of the node.
 *
 * The [File] data class extends [FileSystemNode] and should have a property [content] that represents
 * the content of the file.
 *
 * The [Directory] data class extends [FileSystemNode]. The Directory class should have a property children
 * that represents a list of child nodes, which can be either files or directories (so a list of [FileSystemNode]).
 *
 * 2. Add a main function and create an instance of [Directory] that represents the root of your file system.
 * Add several files and directories as child nodes to the root directory.
 *
 * 3. Implement a method [printFileSystem()] that takes a [FileSystemNode] as input and prints out the entire
 * file system making use of the 'when' statement and recursion.
 *
 * Bonus points: add a [indentLevel] parameter to [printFileSystem] and use it to print the file system with proper
 * indenting.
 */

sealed class FileSystemNode(open val name: String)
data class File(override val name: String, val content: String): FileSystemNode(name)
data class Directory(override val name: String, val children: List<FileSystemNode>) : FileSystemNode(name)

fun main() {
    val root = Directory(
        name = "root",
        children = listOf(
            Directory(
                name = "Work",
                children = listOf(
                    File("HelloWorld.txt", "Hello World"),
                    File("Notes.txt", "Very important notes")
                )
            ),
            Directory(
                name = "Household",
                children = listOf(
                    File("Groceries.txt", "Beer")
                )
            )
        )
    )

    printFileSystem(root)
}

fun printFileSystem(node: FileSystemNode, indentLevel: Int = 0) {
    when (node) {
        is Directory -> {
            println("${" ".repeat(indentLevel)}- ${node.name}")
            node.children.forEach { printFileSystem(it, indentLevel + 2) }
        }
        is File -> println("${" ".repeat(indentLevel)}- ${node.name}")
    }
}
