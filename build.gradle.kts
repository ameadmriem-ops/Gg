// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.kotlin.compose) apply false
  alias(libs.plugins.google.devtools.ksp) apply false
  alias(libs.plugins.secrets) apply false
  alias(libs.plugins.google.services) apply false
}

tasks.register<Sync>("syncSjwjhMainSources") {
  from(layout.projectDirectory.dir("Sjwjh-main/app/src"))
  into(layout.projectDirectory.dir("app/src"))
}

tasks.register<Copy>("syncSjwjhMainProguard") {
  from(layout.projectDirectory.file("Sjwjh-main/app/proguard-rules.pro"))
  into(layout.projectDirectory.dir("app"))
}

tasks.register<Copy>("exportApkToHamza") {
  from(layout.projectDirectory.file("app/build/outputs/apk/debug/app-debug.apk"))
  into(layout.projectDirectory.dir("Sjwjh-main/hamza"))
}
