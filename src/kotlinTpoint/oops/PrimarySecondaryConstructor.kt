package kotlinTpoint.oops
class PrimarySecondaryConstructorTest(name:String){

    constructor(address:String,salary:Int,name: String):this(name){
     println("address:$address")
     println("salary:$salary")
     println("name:$name")
    }
}
fun main(args:Array<String>){
  val obj = PrimarySecondaryConstructorTest("Pune",200,"sainath")
}