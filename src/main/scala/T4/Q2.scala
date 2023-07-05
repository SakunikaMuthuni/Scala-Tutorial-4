package T4

import scala.io.StdIn

object Q2 {
  def printNegative(): Unit = {
    println("Negative number");
  }

  def printZero(): Unit = {
    println("Zero");
  }

  def printEvenNumber(): Unit = {
    println("Even Number");
  }

  def printOddNumber(): Unit = {
    println("Odd Number");
  }

  def checkTheNumber(num:Int): Unit = {
    num match{
      case 0 => printZero();
      case n if n<0 => printNegative();
      case n if n%2==0 => printEvenNumber();
      case n if n%2!=0 => printOddNumber();
    }
  }

  def main(args: Array[String]): Unit = {
    print("Insert a Integer number :");
    val num=scala.io.StdIn.readInt();
    checkTheNumber(num);
  }
}
