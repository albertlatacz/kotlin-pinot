rootProject.name = "kotlin-pinot"

pluginManagement {
    resolutionStrategy {
        val kotlinVersion: String by settings

        eachPlugin {
            when (requested.id.namespace) {
                "org.jetbrains.kotlin" -> useVersion(kotlinVersion)
            }
        }
    }
}

buildscript {
    repositories {
        mavenCentral()
    }
}
