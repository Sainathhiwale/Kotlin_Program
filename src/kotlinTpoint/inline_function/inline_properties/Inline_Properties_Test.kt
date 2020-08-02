package inline_function.inline_properties

fun main(args: Array<String>) {
    print(flag)
}
fun foo(i: Int ): Int{
    var a =  i
    return a
}
inline var flag : Boolean
    get() = foo(10 ) == 10
    set(flag) {flag}