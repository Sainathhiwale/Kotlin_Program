package udemy.exception_handling

import java.lang.ArithmeticException

class ExceptionHandling {

   // val result = 10/0 //Exception in thread "main" java.lang.ArithmeticException: / by zero
    fun add(){
        try {
            val result = 10/0
            println(result)
        }catch (e:ArithmeticException){
            println("Arithmetic Exception")
        }catch (E:Exception){
            println("Exception ")
        }finally {
            println("it will print wether exception is handled or not handled")
        }
    }
}
 fun main(args:Array<String>){

     val obj = ExceptionHandling()
     println("result is :${obj.add()}")
 }