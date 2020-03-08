class MyTest{
    companion object {
        fun create():String{
            return "Hello mr.Sainath"
        }
    }
}

fun main(args:Array<String>){
   val obj = MyTest.create();

}

/*A companion object is an object which is declared inside a class and marked with the companion keyword.
Companion object is used to call the member function of class directly using the class name (like static in java).
A class which contains companion object can also be defined as extension function and property for the companion object.*/