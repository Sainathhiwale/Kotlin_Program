package udemy.inheritance

class Bike:Vehicle() {


    fun twowheel(){
        println("i am riding the bike")
    }

    //access modifier test
    protected fun hello(){
        println("hello protected modifiers")
    }
}