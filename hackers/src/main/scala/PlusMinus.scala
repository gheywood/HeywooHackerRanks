import scala.math.BigDecimal.RoundingMode

object PlusMinus {

  def plusMinus(arr: Array[Int]) =  {
    // Complete this function
    val plus = arr.count(_ > 0)
    val minus = arr.count(_ < 0)
    val equal = arr.count(_ == 0)

    println((BigDecimal(plus) / arr.length).setScale(5, RoundingMode.HALF_UP))
    println((BigDecimal(minus) / arr.length).setScale(5, RoundingMode.HALF_UP))
    println((BigDecimal(equal) / arr.length).setScale(5, RoundingMode.HALF_UP))
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt()
    }
    plusMinus(arr)
  }
}
