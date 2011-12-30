package trellis.operation

import trellis.process._
import trellis.operation._

import org.scalatest.Spec
import org.scalatest.matchers.MustMatchers
import org.scalatest.matchers.ShouldMatchers

@org.junit.runner.RunWith(classOf[org.scalatest.junit.JUnitRunner])
class LiteralSpec extends Spec with MustMatchers with ShouldMatchers {
  val server = TestServer()

  describe("The Literal operation") {
    it("should work with Int") {
      server.run(Literal(33)) must be === 33
    }

    it("should work with String") {
      server.run(Literal("foo")) must be === "foo"
    }
    
    it("should work with List(1,2,3)") {
      server.run(Literal(List(1,2,3))) must be === List(1,2,3)
    }
  }
}
