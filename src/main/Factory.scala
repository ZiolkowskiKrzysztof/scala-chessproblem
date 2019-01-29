package main

trait Piece {

  def x: Int
  def y: Int

  def isAttacking(p: Piece): Boolean

}

case class Bishop(x: Int, y: Int) extends Piece {

  override def isAttacking(p: Piece): Boolean = math.abs(p.x - x) == math.abs(p.y - y)

  override def toString: String = "B"

}

case class King(x: Int, y: Int) extends Piece {

  override def isAttacking(p: Piece): Boolean = (p.x == x && p.y == y + 1) || (p.x == x + 1 && p.y == y + 1) ||
    (p.x == x + 1 && p.y == y) || (p.x == x + 1 && p.y == y - 1) || (p.x == x && p.y == y - 1) || (p.x == x - 1 && p.y == y - 1) ||
    (p.x == x - 1 && p.y == y) || (p.x == x - 1 && p.y == y + 1)

  override def toString: String = "K"

}

case class Knight(x: Int, y: Int) extends Piece {

  override def isAttacking(p: Piece): Boolean = (p.x == x + 1 && p.y == y + 2) || (p.x == x + 2 && p.y == y + 1) ||
    (p.x == x + 2 && p.y == y - 1) || (p.x == x + 1 && p.y == y - 2) || (p.x == x - 1 && p.y == y - 2) || (p.x == x - 2 && p.y == y - 1) ||
    (p.x == x - 2 && p.y == y + 1) || (p.x == x - 1 && p.y == y + 2)

  override def toString: String = "N"

}

case class Rook(x: Int, y: Int) extends Piece {

  override def isAttacking(p: Piece): Boolean = p.x == x || p.y == y

  override def toString: String = "R"

}

case class Queen(x: Int, y: Int) extends Piece {

  override def isAttacking(p: Piece): Boolean = (math.abs(p.x - x) == math.abs(p.y - y)) || p.x == x || p.y == y

  override def toString: String = "Q"

}
