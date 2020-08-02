package inline_function.corssinline_function
/*https://www.geeksforgeeks.org/kotlin-inline-functionsa*/
fun main(args: Array<String>){
    println("Main function starts")
    inlinedfunc({
        println("Lambda expression 1")
    },     // It gives compiler error
        { println("Lambda expression 2") })

    println("Main function ends")
}

inline fun inlinedfunc( crossinline lmbd1: () -> Unit, lmbd2: () -> Unit  ) {
    lmbd1()
    lmbd2()
}