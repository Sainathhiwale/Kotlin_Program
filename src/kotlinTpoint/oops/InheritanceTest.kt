package kotlinTpoint.oops

open class InheritanceSuperTest(){
    fun method1():String{
        return "i am android developer"
    }
    fun method2():Int{
        return 10+10
    }

}
class InheritanceSunClassTest:InheritanceSuperTest(){
    val address:String ="Pune"

    fun subMethod1():String{
        return "kothrod nirali bhajar"
    }
    fun subMethod2():Int{
        return 20+20
    }
}

fun main(args:Array<String>){
   val obj = InheritanceSunClassTest()
   println("super class method1:"+obj.method1())
   println("super class method2:"+obj.method2())
    println("=====subclass method calling=======")
   println("sub class method2:"+obj.subMethod1())
   println("sub class method2:"+obj.subMethod2())
}