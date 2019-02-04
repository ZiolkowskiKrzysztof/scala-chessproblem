package main

class App1 (width: Int, height: Int, pieces: List[(Int, Int) => Piece]){

  val setOfResult = setPieces(pieces)

  def isCheck(p1: Piece, p2: Piece): Boolean = p1.isAttacking(p2) || p2.isAttacking(p1)
  def isSafe(p: Piece, pieces: List[Piece]): Boolean = pieces forall(!isCheck(p, _))

  def arrange(p: (Int, Int) => Piece, x: Int, y: Int): Piece = p match {
    case Bishop => Bishop(x, y)
    case King => King(x, y)
    case Knight => Knight(x, y)
    case Rook => Rook(x, y)
    case Queen => Queen(x, y)
    case _ => throw new IllegalArgumentException("Incorrect name of the figure.")
  }

  def setPieces(pieces: List[(Int, Int) => Piece]): Set[List[Piece]] = pieces match {
    case Nil => Set(List())
    case head :: tail => for {
      pieces <- setPieces(tail)
      w <- 1 to width
      h <- 1 to height
      piece = arrange(head, w, h)
      if (isSafe(piece, pieces))
    } yield (piece :: pieces).sortBy(p => (p.x, p.y))
  }

  def printChess(pieces: List[Piece]): Unit = {
    for (x <- 1 to width) {
      for (y <- 1 to height) {
        pieces.find(p => p.x == x && p.y == y) match {
          case Some(piece) => print(s"$piece ")
          case None => print("x ")
        }
      }
      println()
    }
    println()
  }

  def show(): Unit = {
    val result = setOfResult.size
    setOfResult.take(10).map(printChess(_))
  }

}
