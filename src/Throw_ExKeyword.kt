fun main(args:Array<String>){
    println("enter the name:")
    val name = readLine();
    try {
        if (name=="sai"){
            throw Exception("you don't have access this repo")
        }else{
            println("welcome you have access")
        }
    }catch (ex:Exception){
        println(ex.message)
    }

}