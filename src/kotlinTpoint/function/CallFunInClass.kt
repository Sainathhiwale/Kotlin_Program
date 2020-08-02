package function

fun main(args:Array<String>){
    var str:String //create uint as string and return type(:Unit,:String,:Int,:Boolean)
    str="genesh rolla" //inilizlise the varible this is mutable string data type
   // displays(str)
    var boyObj = Boy() //create the var object to call class method into main method
    boyObj.displays(str) //calling the method using class object
}
class Boy{
    fun displays(str:String){ // method parameter args start with varible name after that with data tyep
        print(str) //display the print statement;
    }
}
