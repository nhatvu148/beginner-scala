package playground

object DemoClass extends App {

  case class Student(var rollNo: Int = 1, var name: String = "Vu", var mark: Int = 10) {
    def show(): Unit = println("Hello class!")

    def >(s2: Student): Boolean = mark > s2.mark
  }

  var s1 = Student(name = "Nhat Vu")
  var s2 = Student(2, "Akayami", 9)
  s1.show()
  println(s1)
  println(s1.>(s2))
  println(s1 > s2)

  var nums = List(2, 4, 3, 8)

  //  for (i <- nums) println(i)

  //  println(nums.drop(2).take(1))
  println(nums.slice(2, 3))
  println(nums drop 2)

  var revNums = nums.reverse

  revNums.foreach((i: Int) => println(i))

  val students = List(Student(), Student(2, "Rin", 8), Student(3, "Ri", 9))

  val first = students.head
  val rest = students.tail
  println(first)
  println(rest)

  val toppers = students.filter(s => s.mark > 9)
  println(toppers)

  // Tuple
  //  val parts = students.partition((s => s.mark > 9))
  //  val part1 = parts._1
  //  val part2 = parts._2
  val (part1, part2) = students.partition(s => s.mark > 9)
  println(part1)
  println(part2)
}
