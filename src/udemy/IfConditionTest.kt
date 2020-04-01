package udemy

fun main(args:Array<String>){
    val value1 = 20
    val value2 =30

    if (value1<value1){
        println("value1 is less then value2")
    }else{
        println("value2 is greater then value1")
    }

    if (value1 > value2){
        println("value1 is grater then value2")
    }else if (value1 ==value2){
        println("value1 and value2 both are equal")
    }else{
        println("value2 is greater then value1")
    }
    //if expression

    val result = if (value1<value2){
         "Expression:value1 is less then value2"
    }else{
        "Experssion:value2 is greater then value1"
    }
    println(result)
}