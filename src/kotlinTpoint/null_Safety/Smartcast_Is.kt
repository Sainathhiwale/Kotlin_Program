package null_Safety

fun main(args:Array<String>){
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
   // if (obj !is String)
    if (obj is String){
        // No Explicit Casting needed.
        println("String length is:${obj.length}")
    }
}