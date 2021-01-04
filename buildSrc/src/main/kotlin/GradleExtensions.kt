import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion.VERSION_1_8

fun BaseExtension.setSdkVersions() {
  compileSdkVersion(AndroidSdk.Compile)
  buildToolsVersion(AndroidSdk.BuildTools)
  defaultConfig {
    minSdkVersion(AndroidSdk.Min)
    targetSdkVersion(AndroidSdk.Compile)
  }

  compileOptions {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
    isCoreLibraryDesugaringEnabled = true
  }
}

fun BaseExtension.setTestOptions() {
  testOptions {
    unitTests.all {
      it.useJUnitPlatform()
    }
  }
}
