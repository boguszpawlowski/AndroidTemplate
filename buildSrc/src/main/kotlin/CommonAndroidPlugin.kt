import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion.VERSION_1_8
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class CommonAndroidPlugin : Plugin<Project> {

    @Suppress("LongMethod")
    override fun apply(target: Project) {
        val androidExtension = target.extensions.getByName("android")

        (androidExtension as? BaseExtension)?.apply {
            compileSdkVersion(AndroidSdk.Compile)
            buildToolsVersion(AndroidSdk.BuildTools)
            defaultConfig {
                minSdkVersion(AndroidSdk.Min)
                targetSdkVersion(AndroidSdk.Target)
                versionName = App.VersionName
                versionCode = App.VersionCode
            }

            compileOptions {
                sourceCompatibility = VERSION_1_8
                targetCompatibility = VERSION_1_8
                isCoreLibraryDesugaringEnabled = true
            }

            testOptions {
                unitTests.all {
                    it.useJUnitPlatform()
                }
            }

            target.tasks.withType(KotlinCompile::class.java).configureEach {
                kotlinOptions {
                    jvmTarget = "1.8"
                    freeCompilerArgs = freeCompilerArgs + "-Xallow-jvm-ir-dependencies"
                }
            }
            target.dependencies.add("coreLibraryDesugaring", Kotlin.DesugarJdkLibs)
        }
    }
}
