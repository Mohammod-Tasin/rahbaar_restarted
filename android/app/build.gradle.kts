plugins {
    [cite_start]id("com.android.application") [cite: 1]
    [cite_start]id("kotlin-android") [cite: 1]
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    [cite_start]id("dev.flutter.flutter-gradle-plugin") [cite: 2]
}

android {
    [cite_start]namespace = "com.example.rahbar_restarted" [cite: 3]
    compileSdk = flutter.compileSdkVersion
    ndkVersion = "29.0.13846066"

    compileOptions {
        // ===== পরিবর্তন ১: এই লাইনটি যোগ করা হয়েছে =====
        coreLibraryDesugaringEnabled = true

        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        [cite_start]applicationId = "com.example.rahbar_restarted" [cite: 3]
        // You can update the following values to match your application needs.
        [cite_start]// For more information, see: https://flutter.dev/to/review-gradle-config. [cite: 4]
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            [cite_start]// Signing with the debug keys for now, so `flutter run --release` works. [cite: 5]
            [cite_start]signingConfig = signingConfigs.getByName("debug") [cite: 6]
        }
    }
}

flutter {
    source = "../.."
}

// ===== পরিবর্তন ২: এই সম্পূর্ণ ব্লকটি ফাইলের শেষে যোগ করা হয়েছে =====
dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
}