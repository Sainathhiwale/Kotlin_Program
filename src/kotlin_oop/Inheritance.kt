package kotlin_oop

fun main(){
  val addition= Addition(10,50,40)
    println(addition.add())
}
open class BaseAddition(val num1:Int,val num2:Int){
   open fun add()=num1+num2
}

class Addition(val number1:Int,val number2:Int,val number3:Int):BaseAddition( number1, number2){

    override fun add(): Int {
        return number1.plus(number2).plus(number3)//super.add()
    }
}