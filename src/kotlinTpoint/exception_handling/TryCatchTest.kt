package exception_handling

fun main(Args:Array<String>){

    try {
        val a =10/0
        println(a)
    }catch (e:Exception){
        println(e)
    }
}