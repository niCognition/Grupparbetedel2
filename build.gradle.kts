
plugins {
  id("java")
  id( "idea")
  // Gradle plugin for handling jfx.
  id("application")
  id("org.openjfx.javafxplugin") version "0.0.8"
}

group = "com.example.dogedice.dogedice"
version = "1.0-SNAPSHOT"

application {
  mainClassName = "com.example.dogedice.Launcher"
}

repositories {
  mavenCentral()
}

dependencies {
  testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
  testImplementation("org.mockito:mockito-core:3.1.0")
  testImplementation("org.mockito:mockito-junit-jupiter:3.1.0")
  // No dependencies yet. Except for JavaFX.
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

tasks.test {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

javafx {
  version = "11"
  modules("javafx.controls", "javafx.fxml")
}

