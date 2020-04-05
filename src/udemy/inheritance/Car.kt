package udemy.inheritance

class Car :Vehicle() {

    fun fourWheel(){
        println("i am driving the car")
    }

    //method override using open keyword becaues every class is final with method
    //we are access the vehicle class(super class ) method into sub class (Car Child class)

    override fun drive(){
        super.drive() // we can call super class (Vehicle)method using 'super' keyword
        println(" i am Driving a car")

    }
}