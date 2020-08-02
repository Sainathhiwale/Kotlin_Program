package null_Safety
/*Kotlin Safe cast operator: as?
Kotlin provides a safe cast operator as? for safely cast to a type. It returns a null if casting is not
possible rather than throwing an ClassCastException exception.
Let's see an example, trying to cast Any type of string value which is initially known by programmer not
by compiler into nullable string and nullable int.
It cast the value if possible or return null instead of throwing exception even casting is not possible.*/

fun main(args:Array<String>){

    val location: Any ="kotlin"
    val safeString:String? = location as? String
    println(safeString)
    val safeInt:Int? = location as? Int
    println(safeInt)
}