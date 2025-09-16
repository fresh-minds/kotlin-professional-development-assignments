import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.2.20"
}

group = "nl.freshminds"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }

    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of("21"))
        }
    }

    tasks {
        withType<KotlinCompile> {
            compilerOptions.jvmTarget.set(JvmTarget.JVM_21)
        }

        getByName<Test>("test") {
            useJUnitPlatform()
        }
    }

    val junitVersion = "5.13.4"

    dependencies {
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
        testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    }
}