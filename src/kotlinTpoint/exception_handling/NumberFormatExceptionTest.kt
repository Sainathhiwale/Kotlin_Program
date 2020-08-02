package exception_handling

fun main(Args:Array<String>){

    //val result = getNumber("10") // ok
    val result = getNumber("10.6") // NumberFormatExecption
    println(result)
}

fun getNumber(s: String): Int {
    return try {
        Integer.parseInt(s)
    }catch (e:Exception){
       0
    }
}
