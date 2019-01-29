package test

import main._

object AttackTest extends App {

  val king = King(2, 2)
  val queen = Queen(2, 2)
  val knight = Knight(3, 3)
  val rook = Rook(2, 2)
  val bishop = Bishop(2, 2)

  val testAttack1 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("King on position (2,2) on board 5x5 is attacking another king on (" + w + "," + h + "): " + king.isAttacking(King(w, h)))

  testAttack1
  println()

  val testAttack2 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("Queen on position (2,2) on board 5x5 is attacking King on (" + w + "," + h + "): " + queen.isAttacking(King(w, h)))

  testAttack2
  println()

  val testAttack3 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("Knight on position (3,3) on board 5x5 is attacking King on (" + w + "," + h + "): " + knight.isAttacking(King(w, h)))

  testAttack3
  println()

  val testAttack4 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("Rook on position (2,2) on board 5x5 is attacking King on (" + w + "," + h + "): " + rook.isAttacking(King(w, h)))

  testAttack4
  println()

  val testAttack5 = for {
    w <- 1 to 5
    h <- 1 to 5
  } yield println("Bishop on position (2,2) on board 5x5 is attacking King on (" + w + "," + h + "): " + bishop.isAttacking(King(w, h)))

  testAttack5
  println()

}
