package string

fun main(args:Array<String>){
    val str1="sainath"
    val str2="sainath"

    println (str1==str2)
    println(str1!=str2)

    //Referential equality (===)
    val str3 = buildString { "string value" }
    val str4 = buildString { "string value" }
    println(str3===str4)
    println(str3!==str4)
}