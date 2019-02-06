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


  val test2 = new App1(width = 4, height = 3, List())

  val arrangeTest1 = test2.setPieces(List(Queen, Queen, Queen))

  val boards1: Set[List[Piece]] = arrangeTest1

  println(boards1.size)
  println()

  val test3 = new App1(width = 3, height = 3, List(Queen, Rook))
  test3.show()

  val test4 = new App1(width = 3, height = 3, List(Queen, Rook))
  test4.show()

  val test5 = new App1(width = 4, height = 4, List(Queen, Knight, King, King))
  test5.show()

  val test6 = new App1(width = 5, height = 5, List(Queen, Queen, Bishop, Bishop, Knight))
  test6.show()

  val test7 = new App1(width = 7, height = 6, List(Queen, Queen, Bishop, Bishop, King, King, Knight))
  test7.show()




}
