package test

import main._

object AppTest extends App {

  val test = new App1(4, 4, List(King, King))

  val king = King(2, 2)

  val safeTest1 = for {
    w <- 1 to 4
    h <- 1 to 4
  } yield println("King on (2,2), Queen on (" + w + "," + h + "). Is check: " + test.isSafe(king, Queen(w, h)))

  safeTest1
}
