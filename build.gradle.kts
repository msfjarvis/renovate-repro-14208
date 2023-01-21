dependencies {
  implementation(libs.sqldelight.androidDriver)
  implementation(libs.sqldelight.primitiveAdapters)
  implementation(libs.sqldelight.extensions.coroutines)
  testImplementation(libs.sqldelight.jvmDriver)
}
