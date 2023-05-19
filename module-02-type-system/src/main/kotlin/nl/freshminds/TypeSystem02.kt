package nl.freshminds

/**
 * Refactor [nameOfSubSubFolder] to a more idiomatic solution. Make use of 'safe calls' and the 'elvis operator'.
 */
fun nameOfSubSubFolder(folder: Folder?): String {
    if (folder != null) {
        if (folder.subFolder != null) {
            if (folder.subFolder.subFolder != null) {
                return folder.subFolder.subFolder.name
            }
        }
    }
    throw IllegalArgumentException("Folder not found")
}