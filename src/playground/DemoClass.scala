package playground

object DemoClass extends App {
  case class Student(var rollNo: Int = 1, var name: String = "Vu", var mark: Int = 10)
  {
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

  revNums.foreach((i: Int) =>  println(i))

}
