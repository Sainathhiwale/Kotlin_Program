package udemy.exception_handling

fun main(args:Array<String>){

    validate(15)
    println()
}

fun validate(age:Int){
    if (age<18)
        throw Exception("under age")
    else
        println("now you are eligible")
}