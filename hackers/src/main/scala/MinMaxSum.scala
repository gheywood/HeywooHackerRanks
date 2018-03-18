object MinMaxSum {

  def miniMaxSum(arr: Array[Int])  =  {
    val arrS = arr.map(_.toLong).sorted
    val max = arrS.tail.sum
    val min = arrS.dropRight(1).sum

    println(s"$min $max")
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var arr = new Array[Int](5)
    for(arr_i <- 0 to 5-1) {
      arr(arr_i) = sc.nextInt()
    }
    miniMaxSum(arr)
  }
}
