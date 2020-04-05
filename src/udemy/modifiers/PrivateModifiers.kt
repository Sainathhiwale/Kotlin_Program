package udemy.modifiers

class PrivateModifiers {
    private  var amt=100

    private fun getAmt(){
        println(amt)
    }
    internal fun display(){
        println(amt)
    }
}

fun main(args:Array<String>){
    val obj = PrivateModifiers()
   // obj.getAmt() within class or preproties field we can access private modifiers
    obj.display()
}