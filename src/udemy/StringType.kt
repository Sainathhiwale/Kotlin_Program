package udemy

fun main(args:Array<String>){
    var myString:String = ""
    var myString2= "Hello"
    println("before value is $myString and $myString2")

    //re_assigned value
    myString = "sainath"
    myString2 ="hiwale"

    println("after init value is $myString and $myString2")

    //get index of string values using for loop
    println(myString[0].toString())
    println(myString[1].toString())
    println(myString[2].toString())
    println(myString[3].toString())
    for (i in myString){
        println(myString)
    }


}

