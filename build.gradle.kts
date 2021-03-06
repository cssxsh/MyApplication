// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven(url = "http://maven.aliyun.com/nexus/content/groups/public/")
        maven(url = "http://maven.aliyun.com/nexus/content/repositories/jcenter")
        maven(url = "http://maven.aliyun.com/nexus/content/repositories/google")
        maven(url = "http://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.0-rc02")
        classpath(kotlin("gradle-plugin", "1.4.0"))

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        maven(url = "http://maven.aliyun.com/nexus/content/groups/public/")
        maven(url = "http://maven.aliyun.com/nexus/content/repositories/jcenter")
        maven(url = "http://maven.aliyun.com/nexus/content/repositories/google")
        maven(url = "http://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}