# Usage

Run app with `scala-cli run App.scala`.

Run tests with `scala-cli --power test README.md`.

```scala
//> using scala 3.3.0
//> using lib com.disneystreaming::weaver-cats:0.8.3
```

```scala test
import weaver.*
import cats.effect.*

object MySuite extends SimpleIOSuite:

  val randomUUID = IO(java.util.UUID.randomUUID())

  test("hello side-effects"):
    for
      x <- randomUUID
      y <- randomUUID
    yield expect(x != y)
```