package udemy

fun main(array: Array<String>){
    var myString:String = """
        | this is my 1st line
        | this is my 2nd line
        | this is my 3rd line
        | this is my 4th line
    """.trimIndent()
   // trimMargin function is use to remove the peepe symbol |
    println(myString.trimMargin())

    var myString2:String = """
         - this is my 1st line
         - this is my 2nd line
         - this is my 3rd line
         - this is my 4th line
    """.trimIndent()

    println(myString2.trimMargin("-"))

}