package udemy.abstract_partical

import sun.rmi.runtime.Log

 abstract class Person {
    private val TAG ="Person"
    var age:Int =0
    var name:String =""
    abstract var height:Int

    fun walk(){
       println("i am walking")
    }
    fun talk(){
        println("i am talking")
    }

    abstract fun eat()

}