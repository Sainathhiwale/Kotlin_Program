package udemy.inheritance

open class Vehicle {

    var colors:String =""
    var engineNo:Int =0
    var cc:String =""


    fun info(){
        println(colors)
        println(engineNo)
        println(cc)
    }
    // add open keywor for method overrideing in car class
    open fun drive() {
        println(" i am Driving")
    }

    fun giveBreak(){
        println("i am break")
    }

}