package kotlinTpoint.oops
open class NonAbstractFunctionTest{
    open fun run(){
        println("car is running")
    }
}
abstract class Hondas:NonAbstractFunctionTest(){
    override abstract fun run()

}
class City:Hondas(){
    override fun run() {
        println("Honda City is running..")
    }

}
fun main(args:Array<String>){
  val obj =NonAbstractFunctionTest()
    obj.run()
    val city =City()
    city.run()

}