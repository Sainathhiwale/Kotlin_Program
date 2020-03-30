package udemy

fun main(argss:Array<String>){
    var myDouble:Double =20.30
    var myDouble2 = 40.30

    println("before value $myDouble and $myDouble2")

    // re_assigned value
    myDouble = 50.40
    myDouble2 = 60.50

    println("after init value $myDouble and $myDouble2")
    var myDouble3= myDouble+myDouble2
    println(" sum of double data type :$myDouble3")


}