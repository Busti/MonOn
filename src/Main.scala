import de.pitkley.jmccs.monitor.{MonitorManager, VCPCode}
import scala.collection.JavaConversions._

object Main extends App {
  val monitors = MonitorManager.get.getMonitors
  for (monitor <- monitors)
    monitor.setVCPFeature(VCPCode.LUMINANCE, 10)
}
