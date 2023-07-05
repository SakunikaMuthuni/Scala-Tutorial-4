package T4

object Q3 {
  def toUpper(str:String): String = {
    val upperStr=str.toUpperCase;
    upperStr;
  }
  def toLower(str:String): String = {
    val lowerStr=str.toLowerCase;
    lowerStr;
  }
  def formatNames(name:String)(formatter: String => String): String = {
    formatter(name);
  }
  def main(args: Array[String]): Unit={
    val names=List("Benny","Niroshan","Saman","Kumara");

    //BENNY
    val op1=formatNames(names(0))(toUpper);

    //NIroshan
    val op21=formatNames(names(1).substring(0,2))(toUpper);
    val op22=names(1).substring(2,8);
    val op2=op21.concat(op22);

    //saman
    val op3=formatNames(names(2))(toLower);

    //KumarA
    val op41=formatNames(names(3).substring(5,6))(toUpper);
    val op42=names(3).substring(0,5);
    val op4=op42.concat(op41);

    println(op1);
    println(op2);
    println(op3);
    println(op4);

  }
}
