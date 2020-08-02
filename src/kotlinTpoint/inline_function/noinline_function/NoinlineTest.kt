package inline_function.noinline_function
/*https://www.geeksforgeeks.org/kotlin-inline-functionsa*/
fun main(args: Array<String>){
    println("Main function starts")
    inlinedFunc({
        println("Lambda expression 1")
        return
    },     // It does not compiler time error
        {
            println("Lambda expression 2")
            //return
        })    // It gives compiler error

    println("Main function ends")
}

inline fun inlinedFunc( lmbd1: () -> Unit, noinline lmbd2: () -> Unit  ) {
    lmbd1()
    lmbd2()
}