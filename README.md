Download
Maven Central JitPack

Gradle
Add below codes to your root build.gradle file (not your module build.gradle file).

allprojects {
    repositories {
        mavenCentral()
    }
}
And add a dependency code to your module's build.gradle file.

dependencies {
    implementation "com.github.skydoves:needs:1.1.2"
}
