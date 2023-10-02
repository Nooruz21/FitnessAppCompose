import org.gradle.api.JavaVersion

object AndroidConfig {
    const val compileSdk = 34
    const val minSdk = 27
    const val targetSdk = 34
    const val versionCode = 1
    const val versionName = "1.0"

    const val release = "release"
    const val debug = "debug"
}

object Namespaces {
    const val app = "com.example.com.example.fitnessapp"
    const val data = "${app}.data"
}

object Options {
    val compileOptions = JavaVersion.VERSION_1_8
    const val kotlinOptions = "1.8"
}