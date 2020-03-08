import java.lang.ArithmeticException
import java.lang.Exception

fun main(args:Array<String>){
    try {
        val num =10/0;
        println("execption try catch in kotlin")
        println("divide by 0 $num")
    }catch (e:ArithmeticException){
        println("execption : $e")
    }catch (ex:Exception){
        println("$ex")
    }finally {
        println("it always executed")
    }

}