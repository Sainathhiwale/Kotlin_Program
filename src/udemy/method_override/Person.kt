package udemy.method_override

open class Person(var role:String ="Person",var name:String="") {
    fun eat(){
        println(name  +"is eating")
    }

    open fun sleep(){
        println(name  +"is sleeping")
    }

}

// student class inherits Person class
class Student(name:String):Person("Student", name){
    // activity function belongs to Student only
    fun activity(){
        println("$name is a $role $name is studying in school.")
    }
    // overrides sleep function of Person class
    override fun sleep(){
        println("$name is a $role. $name goes to bed early.")
    }

    fun doAll(){
        eat()
        sleep()
        activity()
    }
}

fun main(args:Array<String>){
    var student_1 = Student("Sainath")
    println("\n\nAbout "+student_1.name+"\n---------------")
    student_1.doAll()

}