import scala.collection.mutable.ArrayBuffer

object QueensAttack {

  def queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array[Array[Int]]): Int =  {
    // want to start out in each of the 8 directions
    // count squares until we hit an obstacle
    // return the total number of squares
    val xQ = r_q - 1
    val yQ = c_q - 1
    var squares = 0



    0

  }

//  def search(squares: Seq[(Int, Int)], obstacles: Array[Array[Int]]): Int = {
//    var count = 0
//    for (elem <- squares) {
//      if (obstacles(elem._1)(elem._2))
//    }
//    count
//  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var k = sc.nextInt()
    var r_q = sc.nextInt()
    var c_q = sc.nextInt()
    var obstacles = Array.ofDim[Int](k,2)
    for(obstacles_i <- 0 to k-1) {
      for(obstacles_j <- 0 to 2-1){
        obstacles(obstacles_i)(obstacles_j) = sc.nextInt()
      }
    }
    val result = queensAttack(n, k, r_q, c_q, obstacles)
    println(result)
  }
}
