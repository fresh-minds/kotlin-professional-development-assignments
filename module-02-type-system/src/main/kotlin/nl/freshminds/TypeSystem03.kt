package nl.freshminds

/**
 * Implement the [castToFolderAndGetNameOrDefault].
 *
 * Return the name of the folder if [input] is a [Folder], return [defaultName] otherwise.
 */
fun castToFolderAndGetNameOrDefault(input: Any?, defaultName: String): String {
    val folder = input as? Folder
    return folder?.name ?: defaultName
}