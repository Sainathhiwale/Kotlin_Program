import java.util.*

class Test{
    fun isPassed(marks:Int):Boolean{
        return marks>40
    }
    fun isFailed(marks: Int):Boolean{
        return marks<35
    }

}
fun main(args:Array<String>){
    println("enter the marks")
    val  read = Scanner(System.`in`)
    var num = read.nextInt();
    val obj = Test()
   
    obj.isPassed(num)
    obj.isFailed(num);

}