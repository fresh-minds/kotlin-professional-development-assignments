package nl.freshminds

/**
 * Refactor [nameOfSubSubFolder] to a more idiomatic solution. Make use of 'safe calls' and the 'elvis operator'.
 */
fun nameOfSubSubFolder(folder: Folder?) =
    folder?.subFolder?.subFolder?.name ?: throw IllegalArgumentException("Folder not found")
