package kotlinTpoint.oops

class PrimarayConstructorTest(val num: Int, val name: String) {

    fun method1(): String {
        return "sainath " + 1
    }

    fun method2(): Int {
        return 20 + 20
    }
    fun method3():Char{
        return 'd'
    }
}

fun main(args: Array<String>) {
    val obj = PrimarayConstructorTest(1, "sainath")
    println(obj.name)
    println(obj.num)
    println(obj.method1())
    println(obj.method2())
    println(obj.method3())

}