package kotlinTpoint.oops
class SecondaryConstructorTest{

    constructor(num:Int,name:String,address:String,amount:Float){
      println(" num: $num name: $name address:$address amount:$amount")
    }
    constructor(empid:Int,salary:Int,role:String){
     println("empid $empid salary:$salary role:$role")
    }
}
fun main(args:Array<String>){
    val obj2 = SecondaryConstructorTest(2,2000000,"developer")

}