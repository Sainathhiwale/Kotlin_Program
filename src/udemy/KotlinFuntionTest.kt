package udemy

fun main(args:Array<String>){
    val a =100
    val b =50
    cal(a,b)
    cal2(400,300)
    val resultstr = fullName("Sainath","Hiwale")
    println("string fun result : $resultstr")

}

 fun cal(a:Int, b:Int){
    val resultc = a+b
     println("addition :$resultc")
}

fun cal2(a:Int, b:Int):Int{
    val results = a-b
    println(" subtraction : $results")
    return  results
}

fun fullName(name: String, lastName:String):String{

    return "$name $lastName"
}

