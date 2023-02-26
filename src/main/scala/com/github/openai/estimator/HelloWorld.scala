package com.github.openai.estimator

import zio._
import zio.Console._

object HelloWorld extends ZIOAppDefault {
  def run = myAppLogic

  val myAppLogic =
    for {
      _ <- printLine("Hello, World!")
    } yield ()
}