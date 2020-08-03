package kotlinTpoint.oops
open class MethodOverridingTest{
    open fun fly(){
        println("bird is flying")
    }
}
class Parrot: MethodOverridingTest() {
    override fun fly(){
        println("parrot is flying")
    }
}
fun main(args:Array<String>){
 val obj = Parrot()
    println(obj.fly())
}