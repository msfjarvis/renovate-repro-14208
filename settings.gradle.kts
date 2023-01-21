dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    exclusiveContent {
      forRepository { maven("https://oss.sonatype.org/content/repositories/snapshots/") }
      filter { includeGroup("dev.msfjarvis.whetstone") }
    }
    mavenCentral()
  }
}

rootProject.name = "Claw"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
  "android",
  "api",
  "benchmark",
  "common",
  "core",
  "coroutine-utils",
  "database",
  "metadata-extractor",
  "model",
)
