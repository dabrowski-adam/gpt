package app

import weaver.*
import cats.effect.*

object MySuite extends SimpleIOSuite:

  test("hello side-effects"):
    for
      x <- IO.pure(MESSAGE)
    yield expect(x == "Hello toolkit!")