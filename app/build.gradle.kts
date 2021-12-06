plugins {
    id ("com.android.application")
    id ("kotlin-android")
}

android {
    compileSdk =31

    defaultConfig {
        applicationId = "com.pursuit.wanandroid"
        minSdk =21
        targetSdk =31
        versionCode = 1
        versionName ="1.0"

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled =false
            proguardFiles  (
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
        targetCompatibility =JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding =true
    }
}

// val kotlin_version:String by rootProject.ext
dependencies {
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    val nav_version = "2.3.5"

    implementation(fileTree(mapOf("dir" to "libs","include" to listOf("*.jar"))))
    implementation ("androidx.core:core-ktx:1.3.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")
    implementation ("androidx.appcompat:appcompat:1.3.0")
    implementation ("com.google.android.material:material:1.3.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
    implementation ("androidx.core:core-splashscreen:1.0.0-alpha01")
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
}