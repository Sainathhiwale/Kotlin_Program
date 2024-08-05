package connect_kotlin.label

fun main(array:Array<String>){

    getLable()
}
fun getLable(){
    loop@ for (i in 1..10) {
        if (i % 2 == 0) {
            continue@loop // Skip even numbers (i)
        }
        println("Odd number: $i")
    }
}