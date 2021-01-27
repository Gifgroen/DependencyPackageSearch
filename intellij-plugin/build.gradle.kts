plugins {
    id("org.jetbrains.intellij")
    java
    kotlin("jvm")
}

group = "com.gifgroen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin(com.gifgroen.Deps.kotlinStdLib))
    testCompile(com.gifgroen.Deps.junit)
}
// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2020.3"
//    setPlugins("gradle")
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}