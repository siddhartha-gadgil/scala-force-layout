organization := "at.ait.dme.forcelayout"

name := "scala-force-layout"

version := "0.4.0"

scalaVersion := "2.12.8"

// publishMavenStyle := true

// resolvers ++= Seq(
//   // other resolvers here
//   // if you want to use snapshot builds (currently 0.12-SNAPSHOT), use this.
//   "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
//   "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
//   )
//
//
// libraryDependencies ++= Seq(
//   "com.propensive" % "rapture-io" % "2.0.0-M7"
// )

// Extras for publishing to Sonatype Maven repository
// Use 'sbt publish-signed' to publish
// Read more: http://www.scala-sbt.org/0.12.3/docs/Community/Using-Sonatype.html
// and: https://docs.sonatype.org/display/Repository/Sonatype+OSS+Maven+Repository+Usage+Guide#SonatypeOSSMavenRepositoryUsageGuide-8.ReleaseIt
// Nexus UI is at: https://oss.sonatype.org/

// publishTo <<= version { (v: String) =>
//   val nexus = "https://oss.sonatype.org/"
//   if (v.trim.endsWith("SNAPSHOT"))
//     Some("snapshots" at nexus + "content/repositories/snapshots")
//   else
//     Some("releases"  at nexus + "service/local/staging/deploy/maven2")
// }

// pomIncludeRepository := { _ => false }

// pomExtra := (
//   <url>http://github.com/rsimon/scala-force-layout</url>
//   <licenses>
//     <license>
//       <name>MIT</name>
//       <url>http://opensource.org/licenses/MIT</url>
//       <distribution>repo</distribution>
//     </license>
//   </licenses>
//   <scm>
//     <url>https://github.com/rsimon/scala-force-layout.git</url>
//     <connection>scm:git:git@github.com:rsimon/scala-force-layout.git</connection>
//   </scm>
//   <developers>
//     <developer>
//       <id>rsimon</id>
//       <name>Rainer Simon</name>
//       <url>http://rsimon.github.com</url>
//     </developer>
//   </developers>)
