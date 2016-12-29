import ProjectSettings._
import PublicationDetails._
import Dependencies._


// ================================ Module definitions  ================================ //

lazy val root = DefProject(".", "root")
  .aggregate(core,tools)
  .configure(addCommandAliases(
    "ct" -> "; test:compile ; core/test",
    "T" -> "; clean ;t",
    "TT" -> ";+clean ;tt"))
  .settings(preventPublication)

lazy val core = DefProject("core")
  .settings(coreModuleDeps)
  .settings(publicationSettings)


lazy val tools = project
  .settings(commonSettings)
  .settings(name := "tools")
  .settings(toolsModuleDeps)
  .settings(preventPublication)