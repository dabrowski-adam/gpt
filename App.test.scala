import weaver.*
import cats.effect.*

object MySuite extends SimpleIOSuite:

  val randomUUID = IO(java.util.UUID.randomUUID())

  test("hello side-effects"):
    for
      x <- randomUUID
      y <- randomUUID
    yield expect(x != y)