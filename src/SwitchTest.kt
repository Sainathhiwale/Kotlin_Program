fun main(args:Array<String>){
    val  plantPosition = 3

    when(plantPosition){
        0 -> println("you are the ghost")
        1 -> println(  "i am not a ghost")
        2 -> println ("you are younger")
        3 -> println("you are developer")
        4 -> println ("your are software enginner")
        else -> println(" unhandled data ")
    }
}