package udemy

fun main(args:Array<String>){
    val a =100
    val b =50
    cal(a,b)
    cal2(400,300)
    val resultstr = fullName("Sainath","Hiwale")
    println("string fun result : $resultstr")

    //defaulth argument function
    val defResult = findPrecentAmount(100,5)
    println("default function argument is $defResult")

    //named arugment kotlin
   calDimension(40,40,length = 8)

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
//default argument function

fun findPrecentAmount(prize:Int,percent:Int,divider:Int=100):Int{ // 100 is default parameter of function defination

    return  prize -(prize*percent/divider)
}

// kotlin named argument

fun calDimension(width:Int,height:Int,length:Int):Int{
    val value =width*height*length
    println("dimension value is:${value.toShort()}")
    return value
}
