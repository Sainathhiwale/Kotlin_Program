package array

fun main(args:Array<String>){
    val ary = Array<Int>(5){0}
    ary[2]=90
    ary[4]=100
    ary.set(0,80)
    for (element in ary){
        println(element)
    }
    println()
    println("get function is in array:"+ary.get(4))
}