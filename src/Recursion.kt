import java.util.*

fun main(args:Array<String>){
  println("enter the number:")
    val  read = Scanner(System.`in`)
    val  num  = read.nextInt();
    val  factorial = fact(num);
    println("factorial number is : $factorial")
}

fun fact(num:Int):Int{
    if (num==1){
        return num
    }else{
        return num*fact(num-1)
    }

}