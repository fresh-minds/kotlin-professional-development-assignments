package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Assignment03Test {

    @Test
    fun `cast to folder and get name or default`() {
        val folder = Folder("root", null)

        assertEquals("root", castToFolderAndGetNameOrDefault(folder, "defaultFolder"))
        assertEquals("defaultFolder", castToFolderAndGetNameOrDefault(null, "defaultFolder"))
        assertEquals("defaultFolder", castToFolderAndGetNameOrDefault(true, "defaultFolder"))
        assertEquals("defaultFolder", castToFolderAndGetNameOrDefault(5000, "defaultFolder"))
        assertEquals("defaultFolder", castToFolderAndGetNameOrDefault(1.2f, "defaultFolder"))
    }
}