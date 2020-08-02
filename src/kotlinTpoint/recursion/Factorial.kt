package recursion

fun main(args:Array<String>){
    val num=5;
    val result = fact(num)
    println("factorial 5 is: $result")
}

fun fact(num: Int): Int {
    if (num==1){
        return 1
    }else {
        return num * fact(num-1)
    }
}
