package sandbox

import org.scalajs.jquery.jQuery

import scala.scalajs.js
import js.JSConverters._
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
    val replaceData = js.Dynamic.global.replaceData
    val data = text.split("\n").tail.map{ line =>
      val tokens = line.split(",")
      (tokens(0), tokens(1).toDouble)
    }
    val (x, y) = data.unzip
    replaceData(x.toJSArray, y.toJSArray)
  }
}