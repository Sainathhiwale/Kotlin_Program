package udemy

fun main(args:Array<String>){
    var  number1 =12.5
    var  number2 =3.5

    var result:Double
    //addition
     result = number1+number2
    println("number1+number2: $result")

    //subtraction
    result = number1-number2
    println("number1-number2: $result")

    //multiplication
    result = number1*number2
    println("number1*number2: $result")

    //division
    result = number1/number2
    println("number1/number2: $result")

    //modules
    result = number1%number2
    println("number1%number2: $result")


    //mumber function
    var num1=20
    var num2=30;
    var sum =number1.plus(number2)
    sum = (num1+num2).toDouble()

    println("mumber function : $sum")



}
