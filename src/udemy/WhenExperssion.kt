package udemy

fun main(args:Array<String>){
    foo(40)
    getnum(5)

}

fun getnum(i: Int) {
    when(i){
        in 1..10 -> println("a is in a list")
    }
}

fun foo(a:Int){
    when(a){
        10 -> println("a == 10")
        20 -> println("a == 20")
        30 -> println("a == 30")
        40 -> println("a == 40")
        else ->{
            println("a is in not a list")
        }
    }

}