object Versions {
    const val AGP = "8.1.2"
    const val kotlin = "1.8.10"
    const val coroutines = "1.7.3"
    const val KSP = "1.9.10-1.0.13"
    const val material = "1.9.0"
    const val viewBindingDelegate = "1.5.9"
    const val core = "1.12.0"
    const val splashScreen = "1.0.1"
    const val hiltNavGraphViewModels = "1.0.0"
    const val dotsIndicator = "4.3"
    const val activity = "1.7.2"
    const val fragment = "1.6.1"
    const val lifecycle = "2.6.2"
    const val navigation = "2.7.3"
    const val dagger = "2.48"
    const val hiltViewModel = "1.0.0-alpha03"
    const val retrofit = "2.9.0"
    const val compose = "1.4.3"
    const val composeMaterial3 = "1.1.1"
    const val composeCompiler = "1.4.6"
    const val hilt = "2.45"
    const val okHttp = "5.0.0-alpha.2"
    const val composeBom = "2023.03.00"
    const val room = "2.5.2"
    const val paging = "3.2.1"
    const val json = "2.9.1"
    const val circleImage = "3.1.0"
    const val materialCalendar = "2.4.0-beta01"
    const val coil = "2.2.2"
}

object Libraries {

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${
            Versions.coroutines
        }"
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object UIComponents {
        const val material = "com.google.android.material:material:${
            Versions.material
        }"
        const val viewBindingDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${
                Versions.viewBindingDelegate
            }"
    }

    object Core {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val splashscreen = "androidx.core:core-splashscreen:${Versions.splashScreen}"
    }

    object Activity {
        const val activity = "androidx.activity:activity-compose:${Versions.activity}"
    }

    object Fragment {
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val service = "androidx.lifecycle:lifecycle-service:${Versions.lifecycle}"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:${Versions.coil}"
        const val svg = "io.coil-kt:coil-svg:${Versions.coil}"
    }

    object Navigation {
        const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${Versions.dagger}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.dagger}"

        const val hilt_viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModel}"
        const val hiltnavigation = "androidx.hilt:hilt-navigation-fragment:1.0.0"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
        const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }


    object Compose {
        const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
        const val composeUiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val composeUiToolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val composeMaterial =
            "androidx.compose.material3:material3:${Versions.composeMaterial3}"
        const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.compose}"
    }

    object OkHttp {
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val okHttpLoggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    }

    object Room {
        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    }

    object Paging {
        const val runtime = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
        const val common = "androidx.paging:paging-common:${Versions.paging}"
    }

    object CircleImageView {
        const val circleImage = "de.hdodenhof:circleimageview:${Versions.circleImage}"
    }

    object MaterialCalendarView {
        const val materialCalendar = "com.kizitonwose.calendar:view:${Versions.materialCalendar}"
    }

}

object Plugins {

    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val android = "android"
        const val jvm = "jvm"
        const val kapt = "kapt"
    }

    object KSP {
        const val ksp = "com.google.devtools.ksp"
    }

    object Navigation {
        const val safeArgs = "androidx.navigation.safeargs.kotlin"
    }

    object Hilt {
        const val android = "com.google.dagger.hilt.android"
    }
}