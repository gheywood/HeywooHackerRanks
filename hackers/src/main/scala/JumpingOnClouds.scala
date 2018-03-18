object JumpingOnClouds {
  def jumpingOnClouds(c: Array[Int]): Int = {
     c match {
       case _ if c.length == 1 => 0
       case _ if c.length == 2 || c.length == 3 => 1
       case _ if c(2) == 0 => jumpingOnClouds(c.drop(2)) + 1
       case _ => jumpingOnClouds(c.drop(1)) + 1
     }
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var c = new Array[Int](n)
    for(c_i <- 0 to n-1) {
      c(c_i) = sc.nextInt()
    }
    val result = jumpingOnClouds(c)
    println(result)
  }
}
