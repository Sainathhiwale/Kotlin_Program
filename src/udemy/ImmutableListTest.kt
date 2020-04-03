package udemy

fun main(args:Array<String>){

    var list = listOf(1,2,3,4,5,6,7)
    for (element in 0..list.size-1){
        println("list of index: ${element}:and value: ${list[element]}")
    }

    var list2 = listOf<String>("apple","dog","cat","elephant")
    for (i in 0..list2.size-1){
        println("index is: ${i} values: ${list2[i]}")
    }
    //add element into previous list2
    println("new list is added")
    var list3 = list2.plus("fish")
    for (element in 0..list3.size-1){
        println("index is: ${element} values: ${list3[element]}")

    }

    var list4 = listOf(1,2,3,4,5,6,7,8,"apple","dog","cat","fish",33.33,45.55,66.43)
    //get function in list using get() method or index
    println("list is: ${list.get(2)} list of second value: ${list[4]}")
    println("list is: ${list.size}")
    println(" ${list2.contains("apple")}") // return true
    println(" ${list2.isEmpty()}") // return false

   // remove the list4 item using drop and droplast

    println("list4 remove item: ${list4.drop(7)}")

    println("list 4 last item remove :${list4.dropLast(1)}") //base on index it will remove item from list /66.43

    for (element in 0..list4.size-1){
        println("index is: ${element} values: ${list4[element]} ")

    }

}

