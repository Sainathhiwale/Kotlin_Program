package null_Safety

fun main(args:Array<String>){
    val str:String? = null
    var str2: String? = "May be declare nullable string"
    var len1:Int = if (str!=null)str.length else-1
    var len2:Int = if (str2!=null) str2.length else-1
    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")
}