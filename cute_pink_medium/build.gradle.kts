plugins {
	id("java")
	id("org.jetbrains.intellij.platform") version "2.15.0"
}

group   = "com.github.jkoppel.jetbrains_themes"
version = "0.1.0"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(17))
	}
}

repositories {
	mavenCentral()
	intellijPlatform {
		defaultRepositories()
	}
}

dependencies {
	intellijPlatform {
		intellijIdea("2025.3")
	}
}

tasks {
	buildSearchableOptions {
		enabled = false
	}
}
