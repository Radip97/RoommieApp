plugins {
<<<<<<< HEAD
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.kotlin.kapt")
=======
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
>>>>>>> b0db30e (login)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.roommieapp"
<<<<<<< HEAD
    compileSdk = 35
=======
    compileSdk = 34
>>>>>>> b0db30e (login)

    defaultConfig {
        applicationId = "com.example.roommieapp"
        minSdk = 24
<<<<<<< HEAD
        targetSdk = 35
=======
        targetSdk = 34
>>>>>>> b0db30e (login)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
<<<<<<< HEAD
=======
        vectorDrawables.useSupportLibrary = true

        javaCompileOptions.annotationProcessorOptions {
            arguments += mapOf("kapt.kotlin.generated" to "$projectDir/build/generated/source/kaptKotlin")
        }
>>>>>>> b0db30e (login)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
<<<<<<< HEAD
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }

}

dependencies {

    implementation ("com.google.firebase:firebase-bom:32.3.1")
    implementation ("com.google.firebase:firebase-auth-ktx")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("com.google.firebase:firebase-firestore-ktx")


=======

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    packaging.resources.excludes += "/META-INF/{AL2.0,LGPL2.1}"
}

dependencies {
    // Core & Compose
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-text")
    implementation("io.coil-kt:coil-compose:2.4.0")

    // Material & UI
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.cardview:cardview:1.0.0")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")
    kapt("com.github.bumptech.glide:compiler:4.16.0")

    // Firebase (for Kotlin 1.9.0 compatibility)
    implementation(platform("com.google.firebase:firebase-bom:32.7.1"))
    implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-storage-ktx")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
>>>>>>> b0db30e (login)
}

kapt {
    correctErrorTypes = true
<<<<<<< HEAD
=======
    javacOptions {
        option("-source", "17")
        option("-target", "17")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.file=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.main=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.model=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.parser=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.tree=ALL-UNNAMED")
        option("--add-exports", "jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED")
    }
>>>>>>> b0db30e (login)
}
