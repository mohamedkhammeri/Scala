import scala.collection.immutable.ListMap

object ExThree {
  def highest_scores(students: Map[String, Int], k: Int): ListMap[String, Int] = {
    var topStudents: ListMap[String, Int] = ListMap()
    // Sort the map by value
    val res = ListMap(students.toSeq.sortWith(_._2 > _._2): _*)
    // Get first k numbers
    for (i <- 0 until k) {
      topStudents = topStudents + (res.toSeq(i)._1 -> res.toSeq(i)._2)
    }

    topStudents
  }

  def main(args: Array[String]): Unit = {
    val students = Map("Alice" -> 80, "Bob" -> 90, "Charlie" -> 75, "David" -> 85)

    val result = highest_scores(students, 2)
    println(result)
  }
}
