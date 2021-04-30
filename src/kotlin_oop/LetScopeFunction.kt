package kotlin_oop
/*
* scope of function executes black of code in context object and create temperay object for it or this*/
fun main() {

    val numbers = mutableListOf("sainath","raj","ganesh","rudra","pankaj")
    numbers.map { it.length }.filter { it>3 }.let {
        println(it)
    }

    //old thing we are doing
}