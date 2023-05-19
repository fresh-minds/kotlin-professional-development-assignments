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
 */