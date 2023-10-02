plugins {
    id(Plugins.AGP.application)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.kapt)
    // Navigation Safe Args
    id(Plugins.Navigation.safeArgs)
    // Hilt
    id(Plugins.Hilt.android)
    // Kotlin Symbol Processing
    id(Plugins.KSP.ksp)
}

android {
    namespace = Namespaces.app
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = Namespaces.app
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName(AndroidConfig.release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Options.compileOptions
        targetCompatibility = Options.compileOptions
    }
    kotlinOptions {
        jvmTarget = Options.kotlinOptions
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    implementation(Libraries.Core.core)

    implementation(Libraries.Activity.activity)

    implementation(Libraries.Lifecycle.runtime)

    implementation(Libraries.UIComponents.viewBindingDelegate)

    // Core
    implementation(Libraries.Core.core)
    implementation(Libraries.Core.splashscreen)

    // Coil
    implementation(Libraries.Coil.coil)
    implementation(Libraries.Coil.svg)

    // Activity
    implementation(Libraries.Activity.activity)

    // Fragment
    implementation(Libraries.Fragment.fragment)

    // Lifecycle
    implementation(Libraries.Lifecycle.viewModel)
    implementation(Libraries.Lifecycle.runtime)
    implementation(Libraries.Lifecycle.service)

    // Navigation
    implementation(Libraries.Navigation.fragment)
    implementation(Libraries.Navigation.ui)

    // Hilt
    implementation(Libraries.Hilt.android)
    kapt(Libraries.Hilt.compiler)

    implementation(Libraries.Compose.composeUi)
    implementation(Libraries.Compose.composeUiGraphics)
    implementation(Libraries.Compose.composeMaterial)
    implementation(Libraries.Compose.composeRuntime)
    implementation(Libraries.Compose.composeUiToolingPreview)
    implementation(Libraries.Compose.composeUiTooling)
}