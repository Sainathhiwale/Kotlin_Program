import java.lang.ArithmeticException

fun main(args:Array<String>){
    try {
        val num =100/5
        println(num)
        try {
            val n =100/0
            println(n)
        }catch (ex:ArithmeticException){
            ex.printStackTrace()
        }
    }catch (e:ArithmeticException){
        e.printStackTrace()
    }
}