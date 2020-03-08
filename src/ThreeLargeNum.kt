import java.util.*

fun main(args:Array<String>){
    val  read = Scanner(System.`in`);
    println("enter the three number")
    var a = read.nextInt()
    var b = read.nextInt()
    var c = read.nextInt()
    var big :Int =0
    if (a>b){
        big=a
    }else if (b>c){
        big=b
    }else if (c>b){
        big=c
    }
    println("the largest number amoung the three is $big")

}