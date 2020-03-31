package udemy

fun main(args:Array<String>){
    var a=10
    var b=20

    var sum = "result of a+b = ${a.plus(b)}"
    println(sum)

    var a1= 30
    var b1= 40
    val sum1 = """
       | result of a1+b1 = ${a1.plus(b1)}
    """.trimIndent()

    println(sum1.trimMargin())
}