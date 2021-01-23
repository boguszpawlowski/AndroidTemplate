plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  google()
  jcenter()
}

gradlePlugin {
  plugins {
    register("common-android-plugin") {
      id = "common-android-plugin"
      implementationClass = "CommonAndroidPlugin"
    }
  }
}

dependencies {
  implementation("com.android.tools.build:gradle:7.0.0-alpha04")
  implementation(kotlin("gradle-plugin", "1.4.21"))
}

kotlinDslPluginOptions {
  experimentalWarning.set(false)
}
