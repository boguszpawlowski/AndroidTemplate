import org.ajoberstar.grgit.Grgit

plugins {
  id(Android.ApplicationPluginId)
  kotlin(Kotlin.AndroidPluginId)
  id("common-android-plugin")
}

val commitsCount = Grgit.open(mapOf("dir" to rootDir)).log().size

android {
  defaultConfig {
    versionCode = commitsCount
  }
}

dependencies {
  implementation(Kotlin.StdLib)

  implementation(Material.Core)

  implementation(Compose.Runtime)

  implementation(AndroidX.AppCompat)
  implementation(AndroidX.ConstraintLayout)

  debugImplementation(Debug.FoQA)
}
