object KingdomDivision {

    def kingdomDivision(n: Int, roads: Array[Array[Int]]): Int =  {
      // Create a list of the cities holding an array of the cities that it connects to
      var cities = List.fill(n)(List.empty[Int])
      for (road <- roads) {
        cities = cities.updated(road(0) - 1, road(1) :: cities(road(0) - 1))
        cities = cities.updated(road(1) - 1, road(0) :: cities(road(1) - 1))
      }

      println(cities.toString())
      // Now have a list of all the different cities and who they connect to
      // a city can only connect to either all of its own type, or one of each


      0
    }

    def main(args: Array[String]) {
      val sc = new java.util.Scanner (System.in)
      var n = sc.nextInt()
      var roads = Array.ofDim[Int](n-1,2)
      for(roads_i <- 0 to n-1-1) {
        for(roads_j <- 0 to 2-1){
          roads(roads_i)(roads_j) = sc.nextInt()
        }
      }
      val result = kingdomDivision(n, roads)
      println(result)
    }
}
