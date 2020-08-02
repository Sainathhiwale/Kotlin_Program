package recursion

fun main(args:Array<String>){
    rec()
}
var count=0
fun rec() {
   count++
    if (count<=5){
        println("hi "+ count)
        rec()
    }
}
