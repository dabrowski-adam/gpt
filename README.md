# Usage

Run app with `scala-cli run App.scala`.

Run tests with `scala-cli --power test README.md`.

```scala
//> using scala 3.3.0
//> using platform scala-native
//> using nativeVersion 0.4.15
//> using toolkit typelevel:0.1.17
//> using lib com.disneystreaming::weaver-cats:0.8.3
//> using testFramework weaver.framework.CatsEffect
```

```scala test
import weaver._
import cats.effect._

// Suites must be "objects" for them to be picked by the framework
object MySuite extends SimpleIOSuite {

  val randomUUID = IO(java.util.UUID.randomUUID())

  // A test for side-effecting functions
  test("hello side-effects") {
    for {
      x <- randomUUID
      y <- randomUUID
    } yield expect(x != y)
  }

}
```