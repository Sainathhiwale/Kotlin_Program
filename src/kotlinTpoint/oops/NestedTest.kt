package kotlinTpoint.oops
class NestedInnerTest{
    val name:String ="ravikumar"
    fun  method1():String{
        return "sainath"
    }
    class InnnerTest{
        val address:String="Pune"
        fun method2(){
            println("inner class method1")
        }
    }
}
fun main(args:Array<String>){
    println("without object access inner and outer classes method and properties variable")
    println(NestedInnerTest().name)
    println(NestedInnerTest().method1())
    println(NestedInnerTest.InnnerTest().address)
    println(NestedInnerTest.InnnerTest().method2())
    println("===========after object=========== ")
    val obj = NestedInnerTest.InnnerTest()
    println(obj.address)
    println(obj.method2())

}