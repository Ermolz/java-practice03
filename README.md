[![Gradle validation](https://github.com/Ermolz/java-practice03/actions/workflows/gradle.yml/badge.svg)](https://github.com/Ermolz/java-practice03/actions/workflows/gradle.yml)

# Practice 3: Gradle Custom Plugin

Minimal Java project with a custom Gradle plugin implemented through `buildSrc`.

## Project Theme

The project is a small console application called **Mini Library**. It stores a few books, prints all books, and separately prints only available books.

## Custom Gradle Plugin

The custom plugin is located in:

```text
buildSrc/src/main/kotlin/MyProjectPlugin.kt
```

It is applied in `build.gradle.kts`:

```kotlin
apply<MyProjectPlugin>()
```

The plugin adds two tasks:

```text
checkProjectStructure
generateProjectReport
```

## Additional Gradle Task

`build.gradle.kts` also defines one separate custom task:

```text
prepareReleaseFolder
```

## How to Run

Build the project:

```bash
./gradlew build
```

Run the application:

```bash
./gradlew run
```

Run custom tasks:

```bash
./gradlew checkProjectStructure generateProjectReport prepareReleaseFolder
```

On Windows, use:

```powershell
.\gradlew.bat build
.\gradlew.bat run
.\gradlew.bat checkProjectStructure generateProjectReport prepareReleaseFolder
```

## GitHub Actions

The workflow in `.github/workflows/gradle.yml` validates the project by running:

```bash
./gradlew build
./gradlew checkProjectStructure generateProjectReport prepareReleaseFolder
```
