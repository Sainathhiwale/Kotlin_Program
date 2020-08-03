package kotlinTpoint.oops
open class MultipleclassTest{
   open var color:String="White"
    open fun fly(){
        println("birds is flying")
    }
}
interface Duck{
    fun fly(){
       println("duck is flying")
    }
}
class MasterTest:MultipleclassTest(),Duck{
    override var color: String="Green"

    override fun fly() {
        super<MultipleclassTest>.fly()
        super<Duck>.fly()
        println("parrot is flying")
    }

}
fun main(args:Array<String>){
  val obj = MasterTest()
    obj.fly()
    println(obj.color)
}