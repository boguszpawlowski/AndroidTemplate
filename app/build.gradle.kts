plugins {
  id(Android.ApplicationPluginId)
  kotlin(Kotlin.AndroidPluginId)
}
android {
  setSdkVersions()
  defaultConfig {
    versionCode = App.VersionCode
    versionName = App.VersionName
  }
}

dependencies {
  coreLibraryDesugaring(Kotlin.DesugarJdkLibs)
  implementation(Kotlin.StdLibJdk7)

  implementation(Material.Core)

  implementation(AndroidX.AppCompat)
  implementation(AndroidX.ConstraintLayout)

  debugImplementation(Hyperion.Core)
  debugImplementation(Hyperion.Crash)
  debugImplementation(Hyperion.Timber)
  debugImplementation(Hyperion.SharedPrefs)
}
