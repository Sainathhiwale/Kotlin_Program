fun main(args:Array<String>){

    for (n in 1..10){
        println("before break, Loop: $n")
        if (n==5){
            println("I am terminating loop")
            break
        }

    }
}