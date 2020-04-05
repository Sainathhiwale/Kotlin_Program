package udemy

class InitBlock(name:String, age:Int ) {

    var isOlderThenme = false
    var myage =25

    init {
        isOlderThenme = age>myage
    }

    init {
        if (name=="sai"){
            println("name is:$name")
        }
        println("result is $name and $myage")
    }


}