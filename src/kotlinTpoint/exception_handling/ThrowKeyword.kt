package exception_handling

fun main(args:Array<String>){
    validates(15)
}

fun validates(age: Int) {
  if (age<18)
      throw ArithmeticException("under age")
  else
      println("eligible for drive ")
}
