import org.gradle.api.Plugin
import org.gradle.api.Project

class MyProjectPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("checkProjectStructure") {
            group = "custom"
            description = "Checks that important project files and folders exist"

            doLast {
                val srcDir = project.file("src/main/java")
                val buildFile = project.file("build.gradle.kts")

                if (srcDir.exists() && buildFile.exists()) {
                    println("Project structure is correct.")
                } else {
                    println("Important project files or folders are missing.")
                }
            }
        }

        project.tasks.register("generateProjectReport") {
            group = "custom"
            description = "Generates a short project report"

            doLast {
                val reportFile = project.file("build/project-report.txt")
                reportFile.parentFile.mkdirs()

                reportFile.writeText(
                    """
                    Project name: ${project.name}
                    Build file exists: ${project.file("build.gradle.kts").exists()}
                    Source folder exists: ${project.file("src/main/java").exists()}
                    """.trimIndent()
                )

                println("Report created: ${reportFile.path}")
            }
        }
    }
}
