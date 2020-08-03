package kotlinTpoint.oops
open class InheritanceSecondaryConstructorTest{
    constructor(name:String,id:Int){
        println("execute super class constructor $name and $id ")
    }
}
class SubClassTest:InheritanceSecondaryConstructorTest{
  constructor(name: String,id: Int,dept:String):super(name,id){
      println("execute sub class constructor with property $name,$id,$dept")
  }
}
fun main(args:Array<String>){
  val obj = SubClassTest("sainath",233,"software")
    val obj2 = InheritanceSecondaryConstructorTest("ganesh",890)
}