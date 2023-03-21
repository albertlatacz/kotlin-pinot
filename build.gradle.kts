import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
val pinotVersion: String by project

plugins {
    kotlin("jvm")
    java
    idea
}

repositories {
    mavenCentral()
    maven("https://packages.confluent.io/maven/")
}

tasks.withType<JavaCompile> {
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    implementation("org.apache.pinot:pinot-tools:$pinotVersion")
}

