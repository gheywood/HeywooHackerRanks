object Staircase {
  def staircase(n: Int)  =  {
    // Complete this function
    for (x <- 1 to n) {
      if (n != x)
        (1 to (n - x)) foreach(_ => print(" "))

      (1 to x) foreach(_ => print("#"))
      println()
    }
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    staircase(n)
  }
}
