package udemy

fun main(args:Array<String>){
    val s1 ="kotlin"
    var s2:String ="sainath"

    var result:String =""
    result = s1
    println("the string length is: ${result.length}")
   // println("the string length is: ${s1.length}")
    //get string indext using get() function
    println("the s1 string length :${result.get(1)}")
    //get string subSquence() function startvalue and endValue

    println("the s1 string length :${result.subSequence(1,3)}")


}