import java.util.*

fun main(args: Array<String>){
   val  read = Scanner(System.`in`);
    println("enter the first number")
    var a = read.nextInt();
    var b = read.nextInt();
    var big :Int
    if (a>b){
        big =a;
    }else{
        big=b
    }
    println("big number is $big")
}