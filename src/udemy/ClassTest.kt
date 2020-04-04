package udemy

fun main(args:Array<String>){

    var carobj = CarClassTest()
    carobj.carColor = "red"
    carobj.carName = "tata "
    carobj.carNo = 2345
    carobj.cc = "MH20"
    //string row
    var result1 = """
        | my car color is: ${carobj.carColor}
        | my car name is: ${carobj.carName}
        | my car carno is: ${carobj.carNo}
        | my car cc is: ${carobj.cc}
    """.trimIndent()
    println("the result :${result1.trimMargin()}")
    //calling class method
    carobj.drive()
    carobj.giveBreak()
}