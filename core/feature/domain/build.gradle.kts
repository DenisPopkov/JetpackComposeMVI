plugins {
    alias(libs.plugins.app.feature.domain)
}

android {
    namespace = "ru.popkov.android.core.feature.domain"
}

dependencies {
    implementation(libs.kotlin.coroutines)
}
