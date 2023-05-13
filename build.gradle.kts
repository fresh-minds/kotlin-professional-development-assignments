import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
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
            languageVersion.set(JavaLanguageVersion.of("17"))
        }
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "17"
        }

        getByName<Test>("test") {
            useJUnitPlatform()
        }
    }

    dependencies {
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    }
}