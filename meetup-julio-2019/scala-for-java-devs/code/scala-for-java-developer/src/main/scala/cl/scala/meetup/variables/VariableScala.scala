package cl.scala.meetup.variables

object VariableScala {

  def main(args: Array[String]): Unit = {
    // variables Null and Nothing
    val dou1: Double = 0.0;

    val strNull: String = null;

    // Create value types extend AnaVal
    // Mutable variables
    var int1: Int = 0
    var str1: String = "String1"
    // change values
    int1 = 1
    str1 = "String Modified"

    // Inmutable variables
    val int2: Int = 0
    val str2: String = "String2"
    // change values fail
    //int2 = 2
    //str2 = "String Modified"
    // mutable variables modified
    val int3 = int2
    var str3 = str2

    // create reference value extend AnyRef
    val myObject = new MyClass(int2, str2)

  }

  class MyClass(val field1: Int, val field2: String) {

  }

}
