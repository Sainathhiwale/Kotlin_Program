package exception_handling

fun main(args:Array<String>){

    try {
       val a =IntArray(5)
       a[5]=10/0
    }catch (e:ArithmeticException){
        println(e)
    }catch (e:ArrayIndexOutOfBoundsException){
        println(e)
    }catch (e:Exception){
        println(e)
    }
}