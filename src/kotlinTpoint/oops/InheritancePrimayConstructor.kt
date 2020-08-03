package kotlinTpoint.oops
open class InheritancePrimayConstructorTest(empId:Int,empName:String){
    init {
        println("employee id is:$empId")
        println("employee name is:$empName")
    }
}
class Programmer(empId: Int,dept:String,empName: String):InheritancePrimayConstructorTest(empId,empName){
    init {
        println("Employee Name: $empName \n department of employee:$dept \n Employee empid: $empId.")
    }
    fun method1():String{
        return "I am Android Developer"
    }
}
class Saleman(empId: Int,empName: String,dept: String):InheritancePrimayConstructorTest(empId,empName){
    init {
        println("Employee Id:$empId \n Employee Name:$empName \n Employee department:$dept")
    }
    fun method2():Long{
        return 305000/12;
    }
}

fun main(args:Array<String>){
    val obj = Programmer(101,"Software","sainath")
    println( obj.method1())
    val obj2 = Saleman(104,"Karthik","sales")
    println(obj2.method2())
}