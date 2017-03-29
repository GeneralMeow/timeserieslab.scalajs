package sandbox

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExportTopLevel


object Main extends JSApp {
  def main(): Unit = {
    jQuery(() => setupUI())
  }

  def setupUI(): Unit = {
  }

  @JSExportTopLevel("csvUploaded")
  def csvUploaded(text: String): Unit = {
    val data = text.split("\n").tail.map{ line =>
      val tokens = line.split(",")
      (tokens(0), tokens(1).toDouble)
    }

    data.foreach(x => jQuery("body").append("<div>%s: %f</div>".format(x._1, x._2)))
  }
}