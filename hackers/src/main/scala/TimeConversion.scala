import java.text.SimpleDateFormat

object TimeConversion {

  def timeConversion(s: String): String =  {
    // Complete this function
    val AMPMformat = new SimpleDateFormat("hh:mm:ssa")
    val twentyFourFormat = new SimpleDateFormat("HH:mm:ss")
    val date = AMPMformat.parse(s)
    twentyFourFormat.format(date)

  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var s = sc.next()
    val result = timeConversion(s)
    println(result)
  }
}
