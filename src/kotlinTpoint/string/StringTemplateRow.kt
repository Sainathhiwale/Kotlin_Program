package string

fun main(Args:Array<String>){
    val text1 ="Hello \b,JavaTpoint"
    println(text1)
    println()
//or
    val text2 ="Hello, JavaTpoint\n"
    println(text2)
//or
    val text3 ="Hello, \nJavaTpoint"
    println(text3)

    val text = """Kotlin is official language
        |announce by Google for
        |android application development
    """
    println(text)

    //remove white space and | pipe
    val text33 = """Kotlin is official language
        |announce by Google for
        |android application development
    """.trimMargin()
    println(text33)
    println()
    val text44 = """Kotlin is official language
        =announce by Google for
        =android application development
    """.trimMargin("=")
    println(text44)
}
