package kotlinTpoint.oops
 abstract class AbstractClassTest{
    abstract fun dosomething()
}
class Honda: AbstractClassTest() {
    override fun dosomething() {
        println("Honda is running safely..")
    }

}
fun main(args:Array<String>){
  val obj = Honda()
    println(obj.dosomething())
}