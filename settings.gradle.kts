pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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
    versionCatalogs {
        create("libs") {
            version("kotlin", "1.9.22")  // Update ke 1.9.22
            version("compose-compiler", "1.5.9")

            plugin("android-application", "com.android.application").version("8.2.2")
            plugin("kotlin-android", "org.jetbrains.kotlin.android").version("1.9.22")
        }
    }
}

rootProject.name = "tugas_frontend"
include(":app")