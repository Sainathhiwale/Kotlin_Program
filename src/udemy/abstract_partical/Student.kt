package udemy.abstract_partical

class Student :Person() {

    override var height: Int=0
        get() = 10

    override fun eat() {
        println("student: I am eating")
    }

    //student class method non static
    fun stdClass(){
        println("i am student!")
    }

}

fun main(args:Array<String>){

    var stobj = Student()
    stobj.stdClass()
    stobj.eat()
    //access super class member state and propreties
    stobj.height =90
    stobj.name = "sainath"
    stobj.age =40
    println("height is : ${stobj.height}") //override the value
    println("name is : ${stobj.name}")
    println("age is : ${stobj.age}")
}