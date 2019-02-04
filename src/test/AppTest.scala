package test

import main._

object AppTest extends App {

  val test = new App1(4, 4, List(King, King))

  val king = King(2, 2)
  val queen = Queen(2, 2)
  val bishop = Bishop(2, 2)

  val checkTest1 = for {
    w <- 1 to 4
    h <- 1 to 4
  } yield println("King on (2,2), Queen on (" + w + "," + h + "). Is check: " + test.isCheck(king, Queen(w, h)))

  checkTest1

  val checkTest2 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("Queen on (2,2), Rook on (" + w + "," + h + "). Is check: " + test.isCheck(queen, Rook(w, h)))

  checkTest2

  val checkTest3 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("Bishop on (2,2), Knight on (" + w + "," + h + "). Is check: " + test.isCheck(bishop, Knight(w, h)))

  checkTest3

  println()


}
