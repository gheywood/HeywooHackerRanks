object DiagonalDifference {

  def diagonalDifference(a: Array[Array[Int]]): Int =  {
    // Complete this function
    var primarySum = 0
    var secondarySum = 0

    // iterate through summing the primary and secondary diagonals
    for (x <- 0 until a.length) {
      primarySum += a(x)(x)
      secondarySum += a(x)(a(x).length - (x + 1))
    }

    Math.abs(primarySum - secondarySum)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var a = Array.ofDim[Int](n,n);
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt();
      }
    }
    val result = diagonalDifference(a);
    println(result)
  }
}
