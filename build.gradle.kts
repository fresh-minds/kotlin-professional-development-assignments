import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.21"
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

    val junitVersion = "5.11.0"

    dependencies {
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
        testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    }
}