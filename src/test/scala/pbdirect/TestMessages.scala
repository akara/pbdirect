package pbdirect

object TestMessages {
  case class InnerMessage(id: Int, name: String)
}

import TestMessages._

case class NestedInnerMessage(id: Int, inner: InnerMessage)