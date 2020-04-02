package udemy

fun main (args:Array<String>){
    fool4(0,10)
    val array = intArrayOf(1,2,3,4,5,6)
    for (i in array){
        println(" arrays element is:$i")
    }

    for (i in 1..50){
        println("1 to 50 is :$i")
    }
    //reverse loop element
    for (i in 50 downTo 0){
        println("reverse oder downto loop :$i")
    }
}

fun fool4(a:Int, b:Int){
    for (i in a..b){
        println("0 to 10 :$i")
    }
}