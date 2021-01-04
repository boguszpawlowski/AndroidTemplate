plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  google()
  jcenter()
}

dependencies {
  implementation("com.android.tools.build:gradle:7.0.0-alpha03")
}

kotlinDslPluginOptions {
  experimentalWarning.set(false)
}
