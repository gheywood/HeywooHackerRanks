object EqualizeArray {
  def equalizeArray(arr: Array[Int]): Int = {
    // Complete this function
    arr match {
      case arr if arr.sorted.head == arr.sorted.last => 0
      case arr => {
        val grouped = arr.groupBy(x => x).mapValues(_.size)
        val sorted = arr.sortWith(grouped(_) > grouped(_)).dropRight(1)
        equalizeArray(sorted) + 1
      }
    }
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt()
    }
    val result = equalizeArray(arr)
    println(result)
  }
}
