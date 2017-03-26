package sandbox

import org.scalajs.dom
import dom.document
import scala.scalajs.js.JSApp


object Main extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Test")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
}