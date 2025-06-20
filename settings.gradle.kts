@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    plugins {
        val kotlinVersion = "2.1.21"
        val kspSubVersion = "2.0.1"
        id("com.github.ben-manes.versions") version "0.52.0"
        id("com.diffplug.spotless") version "7.0.4"
        id("com.android.application") version "8.11.0-rc01"
        id("org.jetbrains.kotlin.android") version kotlinVersion
        id("com.google.devtools.ksp") version "$kotlinVersion-$kspSubVersion"
        id("com.google.dagger.hilt.android") version "2.56.2"
        id("org.gradle.android.cache-fix") version "3.0.1"
        id("com.autonomousapps.dependency-analysis") version "2.18.0"
    }

    includeBuild("build-logic")
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

include(":app")
