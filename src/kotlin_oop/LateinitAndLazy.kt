package kotlin_oop

fun main() {
   val declaration = Declaration()
    declaration.myName ="Sainath"
    println(declaration.myName)
}

class Declaration{
    lateinit var myName:String

    fun setNameValue(name: String){
        myName =name
    }
    fun getName() = if (::myName.isInitialized) myName else "Not initilized"
}