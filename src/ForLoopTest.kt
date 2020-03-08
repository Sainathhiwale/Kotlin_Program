fun main(args:Array<String>){
    for (i in 1..10){
        println("$i")
    }
    //rangto operator you can use
    for (i in 1.rangeTo(10)){
        println("$i")
    }
    //reverse the order for loop using downTo operator
    for (i in 10 downTo 1){
        println("$i")
    }
    //step keyword operator is used to increment and aslo downTo operator

    for (i in 1..10 step 2){
        println("this $i")
    }

    //downTo operator using increment and decrement
    for (i in 10 downTo  1 step 2){
        println("$i")
    }
  //until operator print only 1to 9 last value not going to print
    for (i in 1 until 10){
        println("until is:$i")
    }
}