package kotlinTpoint.oops
open class PropertyMethodOverridingTest{
   open val color:String ="White"
    open fun fly(){
        println("bird is flying")
    }
}
class Parrots:PropertyMethodOverridingTest() {
    override val color: String ="Black"
    override fun fly() {
        super.fly()
    }
}

fun main(args:Array<String>){
  val obj = Parrots()
    println(obj.fly())
    println(obj.color)
}