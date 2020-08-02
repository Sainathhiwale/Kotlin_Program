package lambda_function

fun main(args:Array<String>){

    val mylambda: (Int)-> Unit = { s:Int-> run { println("addition is $s") } }
    addNumber(4,5,mylambda)
}

fun addNumber(i: Int, i1: Int, mylambda: (Int) -> Unit) {
   val add = i+i1;
    mylambda(add)
}
