fun main(args:Array<String>){

    myloop@ for (ch in 'A'..'B'){
        for (n in 1..4){
            println("$ch and $n")
            if (n==2)
                break@myloop
        }
    }
}