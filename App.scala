//> using scala 3.3.0
//> using platform scala-native
//> using nativeVersion 0.4.15
//> using toolkit typelevel:0.1.17
//> using lib com.disneystreaming::weaver-cats:0.8.3
//> using testFramework weaver.framework.CatsEffect

import cats.effect.*

object Hello extends IOApp.Simple:
  def run = IO.println("Hello toolkit!")