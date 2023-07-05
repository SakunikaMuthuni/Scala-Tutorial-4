package T4

import scala.io.StdIn

object Q1 {
  def chooseInterestRate(deposit:Double): Double = {
    if(deposit<=20000){
      (2.0/100);
    }else if(deposit<=200000){
      (4.0/100);
    }else if(deposit<=2000000){
      (3.5/100);
    }else{
      (6.5/100);
    }
  }

  def calculateInterest(deposit:Double): Double = {
    val rate=chooseInterestRate(deposit);
    val interest=deposit*rate;
    interest;
  }

  def main(args: Array[String]): Unit= {
    printf("Insert the deposit amount :");
    val depositAmount=scala.io.StdIn.readDouble();
    val interest=calculateInterest(depositAmount);
    println("\nThe amount of the interest per month : "+interest);
    println("The amount of interest per Year :"+interest*12);
  }
}
