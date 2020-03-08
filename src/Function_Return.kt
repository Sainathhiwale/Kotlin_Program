fun main(args:Array<String>){
  println("sum : ${sum(10,20,30,40)}")
}
fun sum(vararg num:Int):Int{
    var sum=0
    num.forEach { num-> sum+=num }
    return sum
}