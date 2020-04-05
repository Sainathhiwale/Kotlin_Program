package udemy.modifiers

import udemy.inheritance.Bike
import udemy.inheritance.Car

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

   // inheritance package calling car and bike classes property and method state behavier
     var  bObj = Bike()
     bObj.twowheel()
     //bObj.hello() method we can't call here because it is protected modifiers it access within class only

     // car class
     var cObj = Car()
     cObj.fourWheel()
 }