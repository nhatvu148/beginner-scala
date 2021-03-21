package playground

import scala.math._
import scala.io.StdIn.{readLine, readInt}
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
  def main(args: Array[String]): Unit = {
    var numberGuess = 0
    do {
      print("Guess a number: ")
      numberGuess = readLine.toInt
    } while (numberGuess != 15)

    printf("You guessed the secret number %d\n", 15)
    val name = "Nhat Vu"
    val age = 30
    val weight = 60
    println(s"Hello $name")
    println(f"I am ${age + 1} and weigh $weight%.2f")
  }

  //  val lgPrime = BigInt("342354365876897459867243597843985734857348579834759834758")
  //  println(lgPrime)
  //
  //  val piLarge = BigDecimal("3.14159265358979323846264338327950288419716939937510582097694339323781683248")
  //  println(piLarge)
  //
  //  println(abs(-123))
  //  println(cbrt(-123))
  //  println(round(-123.344234))
  //  println(floor(-123.231232))
  //  println(exp(1))
  //  println(pow(2, 2))
  //  println(log10(1000))
  //  println(log(2.7182818284590455))
  //  println(max(2, 3))
  //  println((random * (11 - 1) + 1).toInt)
  //
  //  var age = 19
  //  val canVote = if (age >= 18) "Yes" else "No"
  //  println(canVote)
  //
  //  var i = 0
  //  var evenList = for {i <- 1 to 20 if (i % 2 == 0)} yield i
  //  for (i <- evenList) println(i)
}
