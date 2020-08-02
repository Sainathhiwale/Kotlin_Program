package inline_function.reified_type_function
/*https://www.geeksforgeeks.org/kotlin-inline-functionsa*/
fun main(args: Array<String>) {
    genericFunc<String>()
}

inline fun <reified T> genericFunc() {
    print(T::class)
}