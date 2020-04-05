package udemy.modifiers

import udemy.inheritance.Bike

internal class InternalModifiers {
   var str ="internal class"
}

fun main(args:Array<String>){
    var obj = Internal1()
    obj.address
    obj.amt
    obj.name

    var obj2 = InternalModifiers()
    println(obj2.str)
    println("name is:${obj.name} addess:${obj.address} amount:${obj.amt}")

    //public access modifiers
    var  pobj = PublicModifier()
    pobj.hello()

    //other package
    var bobj = Bike()
    bobj.twowheel()

}