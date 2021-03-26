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
    versionName = App.VersionName
  }
}

dependencies {
  implementation(Kotlin.StdLib)

  implementation(Material.Core)

  implementation(Compose.Runtime) // FIXME remove if not using compose

  implementation(AndroidX.AppCompat)
  implementation(AndroidX.ConstraintLayout)

  debugImplementation(Debug.FoQA)
}
