pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.kikugie.dev/snapshots")
        maven("https://maven.architectury.dev")
        maven("https://maven.fabricmc.net")
        maven("https://maven.minecraftforge.net")
        maven("https://maven.neoforged.net/releases")
    }
}

plugins {
    id("dev.kikugie.stonecutter") version "0.8.2"
}

stonecutter {
    create(rootProject) {
        fun mc(loader: String, vararg versions: String) {
            for (version in versions) version("$version-$loader", version)
        }
        mc("fabric", "1.21.11", "1.20.5", "1.20", "1.19.3", "1.16.5")
        mc("forge", "1.21.11", "1.20.6", "1.20", "1.19", "1.19.3", "1.18", "1.16.5")
        mc("neoforge", "1.21.11", "1.21")
    }
}

rootProject.name = extra["mod.name"] as String
