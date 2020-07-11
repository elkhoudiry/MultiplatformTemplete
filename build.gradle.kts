
group = "dev.ryinex"
version = "0.1.0"


buildscript {
    val kotlin_version = "1.3.72"
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:3.6.3")
        classpath ("com.google.gms:google-services:4.3.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}