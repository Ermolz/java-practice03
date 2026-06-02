plugins {
    java
    application
}

apply<MyProjectPlugin>()

repositories {
    mavenCentral()
}

application {
    mainClass.set("Main")
}

tasks.register("prepareReleaseFolder") {
    group = "custom"
    description = "Creates the release folder for prepared files"

    doLast {
        val releaseDir = file("release")
        releaseDir.mkdirs()
        println("Release folder created: ${releaseDir.path}")
    }
}
