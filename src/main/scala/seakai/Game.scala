package seakai

import scala.scalajs.js
import js.Dynamic.{ global => g }
import org.scalajs.dom
import org.scalajs.dom.extensions._
import org.scalajs.dom.HTMLCanvasElement

object Game {
  Keyboard.init()
  Canvas.init()

  def update(seconds: js.Number) = {
  }

  def main(): Unit = {
    new GameLoop().start(update, () => Canvas.render())
  }
}
