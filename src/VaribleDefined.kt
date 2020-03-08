fun main(args:Array<String>){
    var samplevalue :Int = 10
    var str :String
    str = "sainath"
    var value :Float = samplevalue.toFloat();
    var valueDoub :Double = value.toDouble();
    var chvalue : Char?
    chvalue ='S';

    var intchar : Int = chvalue.toInt()
    println("char converted into integer: ${intchar}")

    var gender ='F'
    println("gender = $gender")
    var num1 =10;
    var num2 =20;
    val results = num1+num2;
    println("addition is:"+results)
    println("the samplevalue is :${samplevalue}")
    println("the float values is :${value}")
    println("the double values is :${valueDoub}")
    println("the char values is :${chvalue}")
    print("the samplevalue is :${str}")

}