plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ozanyazici.kotlincoroutines"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ozanyazici.kotlincoroutines"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC2")//Temel coroutine özelliklerini içerir. Bu kütüphane, coroutine builder'ları, suspend fonksiyonları ve coroutine kapsamlarını içerir. Bu bağımlılık, herhangi bir platforma özgü olmayan temel coroutine özelliklerini sağlar.
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")//Bu bağımlılık, Android platformu için özel olarak optimize edilmiş coroutine'leri içerir. Özellikle UI thread üzerinde kullanılmak üzere tasarlanmıştır ve Android uygulamalarında asenkron programlama için kullanılır.
}