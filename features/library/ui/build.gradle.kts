plugins {
    alias(libs.plugins.app.feature.ui)
}

android {
    namespace = "ru.popkov.composesample.features.library.ui"
}

dependencies {
    implementation(project(":core:feature:domain"))
    implementation(project(":features:library:nav"))
    implementation(project(":theme"))
}
