package sandbox

import org.scalajs.jquery.jQuery

import scala.scalajs.js.JSApp


object Main extends JSApp {
  def main(): Unit = {
    jQuery(() => setupUI())
  }

  def setupUI(): Unit = {
    jQuery("#upload-button").click(() => uploadClicked())
    jQuery("body").append("<p>Hello World</p>")
  }

  def uploadClicked(): Unit = {
    jQuery("body").append("<p>You clicked the upload button!</p>")
  }
}