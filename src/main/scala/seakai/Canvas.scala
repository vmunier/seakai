package seakai

import scala.scalajs.js
import js.Dynamic.{ global => g }
import org.scalajs.dom
import org.scalajs.dom.extensions._

object Canvas {
  lazy val canvas = dom.document.createElement("canvas").cast[dom.HTMLCanvasElement]
  private lazy val ctx = canvas.getContext("2d").cast[dom.CanvasRenderingContext2D]

  // use a smaller inner window size value to prevent possible scrolling
  lazy val windowHeight = g.window.innerHeight * 0.98
  lazy val windowWidth = g.window.innerWidth * 0.98

  def init() = {
    canvas.width = windowWidth
    canvas.height = windowHeight
    g.document.body.appendChild(canvas)
    canvas
  }

  def render() = {
    // clear window
    ctx.clearRect(0, 0, canvas.width, canvas.height)
    displayText("Welcome to Seakai game")
  }

  private def displayText(text: String) = {
    ctx.fillStyle = "black"
    ctx.font = "20px Arial"
    ctx.textAlign = "center"
    ctx.fillText(text, windowWidth / 2, windowHeight / 2)
  }
}
