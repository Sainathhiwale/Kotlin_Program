package kotlin_oop

class Example{
    private var number:Int =5
     fun calculate():Int{
         return number*number;
     }
}
fun main(args:Array<String>){
    val  obj = Example();
   println( "${obj.calculate()}");
}
