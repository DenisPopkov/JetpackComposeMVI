@file:Suppress("UnstableApiUsage")

pluginManagement {
    includeBuild("gradle-plugins")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "JetpackComposeMVI"
include(
    ":app",
    ":core:feature:nav",
    ":core:feature:ui",
    ":core:feature:data",
    ":core:feature:domain",
    ":features:library:nav",
    ":features:library:ui",
    ":features:spotlight:nav",
    ":features:spotlight:ui",
    ":theme",
)
