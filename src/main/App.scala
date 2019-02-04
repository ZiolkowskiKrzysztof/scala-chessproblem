package main

class App1 (width: Int, height: Int, pieces: List[(Int, Int) => Piece]){

  def isCheck(p1: Piece, p2: Piece): Boolean = p1.isAttacking(p2) || p2.isAttacking(p1)

  def arrange(p: (Int, Int) => Piece, x: Int, y: Int): Piece = p match {
    case Bishop => Bishop(x, y)
    case King => King(x, y)
    case Knight => Knight(x, y)
    case Rook => Rook(x, y)
    case Queen => Queen(x, y)
    case _ => throw new IllegalArgumentException("Incorrect name of the figure.")
  }

  def setPieces(pieces: List[(Int, Int) => Piece]) = pieces match {
    case Nil => Set()
    case head :: tail => for {
      pieces <- setPieces(tail)
      w <- 1 to width
      h <- 1 to height
      piece = arrange(head, w, h)
      if (!isCheck(piece, _))
    } yield (piece :: pieces)
  }
  //TODO: MAKE IT WORK!

}
