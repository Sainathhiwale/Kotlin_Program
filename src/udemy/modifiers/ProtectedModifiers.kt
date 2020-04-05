package udemy.modifiers

open class ProtectedModifiers {
    protected  var  a=10

}
 class ChildProtected:ProtectedModifiers(){

    protected fun getValue():Int{
        return a
    }
     fun display(){
        println(a)
    }
}
fun main(args:Array<String>){

    val obj = ChildProtected()
    println(obj.display())

}