package app

import cats.effect.*

val MESSAGE = "Hello toolkit!"

object App extends IOApp:

  def hello = IO.pure(println("hello")).as(ExitCode.Success)

  def run(args: List[String]): IO[ExitCode] =
    hello.guaranteeCase:
      case Outcome.Canceled() =>
        IO(println("Interrupted: releasing and exiting!"))
      case _ =>
        IO(println("Normal exit!"))