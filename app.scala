package app

import cats.effect.*

val MESSAGE = "Hello toolkit!"

object Hello extends IOApp.Simple:
  def run = IO.println(MESSAGE)