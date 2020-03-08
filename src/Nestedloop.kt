fun main(args:Array<String>){

    for (ch in 'A'..'B'){
        for (n in 1..4){
            println("$ch and $n")
            if (n==3)
                break
        }
    }
}