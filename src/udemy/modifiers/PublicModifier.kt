package udemy.modifiers

class PublicModifier {
     var a = 20
     var name = "sainath"
     var address = "pune"

    internal fun hello(){
        println("hello kotlin")
    }
}
 fun main(args:Array<String>){
     val obj = PublicModifier()
     obj.address
     obj.name
     obj.hello()
     println("name is:${obj.name} addess:${obj.address} amount:${obj.a}")
         //obj.a, obj.name and obj.address obj.hello() are visible for public and internal modifiers
     // obj.a, obj.name and obj.address obj.hello() are not visible if set modifier as private and protected


 }