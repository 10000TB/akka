import akka.{ AkkaBuild, Formatting, OSGi, Dependencies, Version }
import com.typesafe.tools.mima.plugin.MimaKeys

AkkaBuild.defaultSettings

Formatting.formatSettings

OSGi.actor

Dependencies.actor

MimaKeys.previousArtifacts := akkaPreviousArtifacts("akka-actor").value

spray.boilerplate.BoilerplatePlugin.Boilerplate.settings

Version.versionSettings
