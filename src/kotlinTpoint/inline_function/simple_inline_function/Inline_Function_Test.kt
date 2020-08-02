package inline_function.simple_inline_function
/*https://www.javatpoint.com/kotlin-inline-function*/
fun main(args: Array<String>) {
    inlineFunction({ println("calling inline functions")})
}

inline fun inlineFunction(myFun: () -> Unit ) {
    myFun()
    print("code inside inline function")
}