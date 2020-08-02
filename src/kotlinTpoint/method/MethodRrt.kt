package method

fun main(args:Array<String>){
    var a=10;
    var b=20;
    println(add(a,b))
    println(mul(a,b))
    println(div(a,b))
    print(substr(a,b))

}
fun add(a:Int,b:Int):Int{
    return a+b
}
fun mul(a:Int,b:Int):Int{
    return a*b
}
fun div(a:Int,b:Int):Int{
    return a/b
}
fun substr(a:Int,b:Int):Int{
    return a-b
}