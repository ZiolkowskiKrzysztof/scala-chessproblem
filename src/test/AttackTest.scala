package test

import main.King

object AttackTest extends App {

  val king1 = King(2, 2)
  val

  val testAttack1 = for {
    w <- 1 to 4
    h <- 1 to 4
  } yield println(king1.isAttacking(King(w, h)) + " on position (" + w + "," + h + ").")

  testAttack1


}
