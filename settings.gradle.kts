rootProject.name = "booster"

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

include(":booster-aapt2")
include(":booster-android-api")
include(":booster-android-instrument")
include(":booster-android-instrument-activity-thread")
include(":booster-android-instrument-finalizer-watchdog-daemon")
include(":booster-android-instrument-logcat")
include(":booster-android-instrument-media-player")
include(":booster-android-instrument-res-check")
include(":booster-android-instrument-shared-preferences")
include(":booster-android-instrument-thread")
include(":booster-android-instrument-toast")
include(":booster-android-instrument-webview")
include(":booster-android-gradle-api")
include(":booster-android-gradle-compat")
include(":booster-android-gradle-v3_3")
include(":booster-android-gradle-v3_4")
include(":booster-android-gradle-v3_5")
include(":booster-android-gradle-v3_6")
include(":booster-android-gradle-v4_0")
include(":booster-android-gradle-v4_1")
include(":booster-android-gradle-v4_2")
include(":booster-android-gradle-v7_0")
include(":booster-android-gradle-v7_1")
include(":booster-android-gradle-v7_2")
include(":booster-android-gradle-v7_3")
include(":booster-android-gradle-v7_4")
include(":booster-annotations")
include(":booster-api")
include(":booster-build")
include(":booster-cha")
include(":booster-cha-asm")
include(":booster-command")
include(":booster-graph")
include(":booster-graph-dot")
include(":booster-graph-json")
include(":booster-gradle-plugin")
include(":booster-task-analyser")
include(":booster-task-check-snapshot")
include(":booster-task-compression")
include(":booster-task-compression-cwebp")
include(":booster-task-compression-pngquant")
include(":booster-task-compression-processed-res")
include(":booster-task-graph")
include(":booster-task-list-artifact")
include(":booster-task-list-permission")
include(":booster-task-list-shared-library")
include(":booster-task-resource-deredundancy")
include(":booster-task-spi")
include(":booster-test")
include(":booster-test-asm")
include(":booster-test-javassist")
include(":booster-transform-activity-thread")
include(":booster-transform-asm")
include(":booster-transform-br-inline")
include(":booster-transform-finalizer-watchdog-daemon")
include(":booster-transform-javassist")
include(":booster-transform-logcat")
include(":booster-transform-media-player")
include(":booster-transform-res-check")
include(":booster-transform-service-loader")
include(":booster-transform-shared-preferences")
include(":booster-transform-r-inline")
include(":booster-transform-spi")
include(":booster-transform-thread")
include(":booster-transform-toast")
include(":booster-transform-usage")
include(":booster-transform-util")
include(":booster-transform-webview")
include(":booster-kotlinx")
