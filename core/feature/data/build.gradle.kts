plugins {
    alias(libs.plugins.app.feature.data)
    alias(libs.plugins.app.android.room)
}

android {
    namespace = "ru.popkov.android.core.feature.data"
}

dependencies {
    implementation(project(":core:feature:domain"))
    implementation(libs.kotlin.coroutines)
    implementation(libs.bundles.retrofit)
}
