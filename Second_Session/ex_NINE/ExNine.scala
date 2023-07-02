object ExNine {
  def anagram(str1: String, str2: String): Boolean = {
    str1.sorted.equals(str2.sorted)
  }

  def main(args: Array[String]): Unit = {
    val str1 = "listen"
    val str2 = "silent"
    println(anagram(str1, str2))
  }
}
