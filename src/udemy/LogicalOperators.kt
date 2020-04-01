package udemy

fun main(args:Array<String>){
    var a=10
    var b=30
    var c= -10
    var result:Boolean

    result = (a>b) && (a>c)
    println(result) // false beacuse both condition should be true

    result = (a>b) || (a>c)
    println(result) // true if one condtion is true result is true only

    if (a>b && a>c){
        println("true")
    }else{
        println("false")
    }
    if (a>b || a>c){
        println("true")
    }else{
        println("false")
    }

    if (20>12 && 23>10 ){
        println("true 20 and 23 is greater = true")
    }else{
        println("not greater = false")
    }
}