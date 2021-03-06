// Comment to get more information during initialization
logLevel := Level.Warn

// https://github.com/scoverage/sbt-scoverage/releases
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

// https://github.com/scoverage/sbt-coveralls/releases
addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.7")

// https://github.com/codacy/sbt-codacy-coverage/releases
addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.15")
