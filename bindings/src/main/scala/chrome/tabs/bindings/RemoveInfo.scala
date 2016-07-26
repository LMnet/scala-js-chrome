package chrome.tabs.bindings

import chrome.windows.bindings.Window

import scala.scalajs.js

@js.native
trait RemoveInfo extends js.Object {

  def windowId: Window.Id = js.native

  def isWindowClosing: Boolean = js.native

}
