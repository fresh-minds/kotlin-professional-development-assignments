package nl.freshminds

/* This file does not contain any assignments! */

// We will learn more about data classes in module-04
data class Folder(
    val name: String,
    val subFolder: Folder?
)