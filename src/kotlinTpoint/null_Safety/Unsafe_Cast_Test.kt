package null_Safety

fun main(args:Array<String>){
   /* val obj:Any? =null
    val str: String = obj as String
    println(str)
    Exception in thread "main" kotlin.TypeCastException: null cannot be cast to non-null type kotlin.String
    */

    //Unsafe cast operator: as
    val obj:Any? ="sainath hiwale"
    val str:String = obj as String;
    println(str)

    val ob: Any = 123
    val str2: Int = ob as Int
    println(str2)
    //// Throws java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    val objs:String? = "String unsafe cast"
    val str3 :String = objs as String
    println(str3)
}