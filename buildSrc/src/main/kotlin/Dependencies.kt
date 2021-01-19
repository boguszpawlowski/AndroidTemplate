@file:Suppress("ObjectPropertyNaming", "ClassNaming", "UnderscoresInNumericLiterals")
object App {
  private const val versionMajor = 0
  private const val versionMinor = 0
  private const val versionPatch = 1
  private val versionClassifier: String? = null
  private const val isSnapshot = true

  private fun generateVersionCode() =
    AndroidSdk.Min * 10000000 + versionMajor * 10000 + versionMinor * 100 + versionPatch

  private fun generateVersionName(): String {
    val versionName = "$versionMajor.$versionMinor.$versionPatch"
    val classifier = if (versionClassifier == null && isSnapshot) {
      "-SNAPSHOT"
    } else versionClassifier ?: ""

    return "$versionName$classifier"
  }

  val VersionCode = generateVersionCode()
  val VersionName = generateVersionName()
}

object AndroidSdk {
  const val Min = 24
  const val Compile = 30
  const val Target = Compile
  const val BuildTools = "30.0.2"
}

object Kotlin {
  const val Version = "1.4.21-2"

  const val GradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$Version"
  const val StdLibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$Version"
  const val SafeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:2.2.0"

  const val AndroidPluginId = "android"
  const val KaptPluginId = "kapt"
  const val SafeArgsPluginId = "androidx.navigation.safeargs.kotlin"
  const val JavaLibraryPluginId = "java-library"

  const val DesugarJdkLibs = "com.android.tools:desugar_jdk_libs:1.0.9"
}

object Android {
  const val GradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha04"

  const val ApplicationPluginId = "com.android.application"
  const val LibraryPluginId = "com.android.library"
}

object GradleVersions {
  const val Version = "0.36.0"

  const val PluginId = "com.github.ben-manes.versions"
  const val Plugin = "com.github.ben-manes:gradle-versions-plugin:$Version"
}

object Coroutines {
  const val Version = "1.3.9"

  const val Core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$Version"
}

object SqlDelight {
  const val Version = "1.2.0"

  const val PluginId = "com.squareup.sqldelight"
  const val Plugin = "com.squareup.sqldelight:gradle-plugin:$Version"

  const val AndroidDriver = "com.squareup.sqldelight:android-driver:$Version"
  const val Extensions = "com.squareup.sqldelight:coroutines-extensions:$Version"
}

object AndroidX {
  const val Version = "1.0.0"
  const val LifecycleVersion = "2.2.0"

  const val AppCompat = "androidx.appcompat:appcompat:1.2.0"
  const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
  const val lifecycle = "androidx.lifecycle:lifecycle-extensions:$LifecycleVersion"
  const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$LifecycleVersion"
  const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LifecycleVersion"
}

object Material {
  const val Core = "com.google.android.material:material:1.2.1"
}

object DetektLib {
  const val Version = "1.15.0"

  const val PluginId = "io.gitlab.arturbosch.detekt"
  const val Plugin = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$Version"

  const val Formatting = "io.gitlab.arturbosch.detekt:detekt-formatting:$Version"
  const val Cli = "io.gitlab.arturbosch.detekt:detekt-cli:$Version"
}

object Moshi {
  const val Version = "1.11.0"

  const val Core = "com.squareup.moshi:moshi:$Version"
  const val CodeGen = "com.squareup.moshi:moshi-kotlin-codegen:$Version"
}

object Koin {
  const val Version = "2.2.1"

  const val Core = "org.koin:koin-core:$Version"
  const val Android = "org.koin:koin-android:$Version"
  const val ViewModel = "org.koin:koin-androidx-viewmodel:$Version"
  const val Compose = "org.koin:koin-androidx-compose:$Version"
}

object Compose {
  const val Version = "1.0.0-alpha09"
  const val AccompanistVersion = "0.4.0"

  const val Runtime = "androidx.compose.runtime:runtime:$Version"
  const val Compiler = "androidx.compose.compiler:compiler:$Version"
  const val Foundation = "androidx.compose.foundation:foundation:$Version"
  const val FoundationLayout = "androidx.compose.foundation:foundation-layout:$Version"
  const val Material = "androidx.compose.material:material:$Version"
  const val Ui = "androidx.compose.ui:ui:$Version"
  const val UiTooling = "androidx.compose.ui:ui-tooling:$Version"
  const val MaterialIconsExtended = "androidx.compose.material:material-icons-extended:$Version"
  const val CoilImage = "dev.chrisbanes.accompanist:accompanist-coil:$AccompanistVersion"
  const val Navigation = "androidx.navigation:navigation-compose:1.0.0-alpha03"
}

object Firebase {
  const val AppDistributionPlugin =
    "com.google.firebase:firebase-appdistribution-gradle:1.3.1"
  const val CrashlyticsPlugin =
    "com.google.firebase:firebase-crashlytics-gradle:2.0.0-beta04"
  const val GoogleServicesPlugin =
    "com.google.gms:google-services:4.3.3"

  const val AppDistributionPluginId = "com.google.firebase.appdistribution"
  const val CrashlyticsPluginId = "com.google.firebase.crashlytics"
  const val GoogleServicesPluginId = "com.google.gms.google-services"

  const val Analytics = "com.google.firebase:firebase-analytics:17.2.2"
  const val Crashlytics = "com.google.firebase:firebase-crashlytics:17.0.0-beta04"
}

object Debug {
  const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:2.4"
  const val RedScreenOfDeath = "com.melegy.redscreenofdeath:red-screen-of-death:0.1.1"
  const val Timber = "com.jakewharton.timber:timber:4.7.1"
  const val Foqa = "pl.droidsonroids.foqa:foqa:0.1.22"
}

object Hyperion {
  const val Version = "0.9.30"

  const val Core = "com.willowtreeapps.hyperion:hyperion-core:$Version"
  const val Timber = "com.willowtreeapps.hyperion:hyperion-timber:$Version"
  const val SharedPrefs = "com.willowtreeapps.hyperion:hyperion-shared-preferences:$Version"
  const val Crash = "com.willowtreeapps.hyperion:hyperion-crash:$Version"
}

object Kotest {
  const val Version = "4.2.6"

  const val RunnerJunit5 = "io.kotest:kotest-runner-junit5-jvm:$Version"

  const val Assertions = "io.kotest:kotest-assertions-core-jvm:$Version"
}
