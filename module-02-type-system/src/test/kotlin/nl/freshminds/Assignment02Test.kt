package nl.freshminds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class Assignment02Test {

    @Test
    fun `return name of the sub sub folder if it exists`() {
        val sub2Folder = Folder("sub2", null)
        val sub1Folder = Folder("sub1", sub2Folder)
        val rootFolder = Folder("root", sub1Folder)

        val actual = nameOfSubSubFolder(rootFolder)
        assertEquals("sub2", actual)

        assertThrows(IllegalArgumentException::class.java) { nameOfSubSubFolder(null) }
        assertThrows(IllegalArgumentException::class.java) { nameOfSubSubFolder(sub1Folder) }
        assertThrows(IllegalArgumentException::class.java) { nameOfSubSubFolder(sub2Folder) }
    }
}