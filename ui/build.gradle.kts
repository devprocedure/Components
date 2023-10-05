@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id(libs.plugins.kotlin.android.get().pluginId)
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.ksp.get().pluginId) version libs.versions.ksp.get()
    id(libs.plugins.compose.themer.get().pluginId) version libs.versions.compose.themer.get()
}

buildscript {
    dependencies {
        classpath(libs.compose.themer.generator)
    }
}

android {
    namespace = "com.devprocedure.ui"
    compileSdk = Configuration.compileSdk

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    val generatedDir = "build/generated/com/"
    sourceSets.getByName("main") {
        kotlin.srcDir("$generatedDir")
    }
    sourceSets.configureEach {
        kotlin.srcDir("$buildDir/generated/ksp/$name/kotlin/")
    }
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.ui.tooling.preview)
    debugApi(libs.androidx.compose.ui.tooling)

    implementation(libs.compose.themer.core)
    ksp(libs.compose.themer.processor)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
}