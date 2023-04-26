# Download
 from ## JitPack

Gradle
Add below codes to your root build.gradle file (not your module build.gradle file).

allprojects {
    repositories {
       	maven { url 'https://jitpack.io' }
    }
}
And add a dependency code to your module's build.gradle file.

dependencies {
	   implementation 'com.github.Muhammadali-mk:lib-shared-preference:1.0.0'
}
