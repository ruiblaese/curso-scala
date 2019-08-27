package lectures.part1basics

object ValuesVariablesTypes extends App {

  // VALS ARE IMMUTABLE
  val x0 : Int = 42

  //COMPILER can infer types
  val x = 42
  println(x)

  var aString: String = "hello"
  var anotherString = "goodbye"
  println(aString)

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLog: Long = 1231212312132L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4
  aVariable = 5 //side effects
  println(5)


}
