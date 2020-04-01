package udemy

fun main(args:Array<String>){
    val s:String ="1000"
    val b:Byte =127
    val f:Float =35.5f
    val l:Long = 34345
    //convert string to int
    var toIntVal = s.toInt()
   // toIntVal =3000
    println(toIntVal)

    //convert byte to Long
    var toLongVal = b.toLong()
    //toLongVal =400000
    println(toLongVal)

    //convert float to double
    var toDoubleVal = f.toDouble()
   // toDoubleVal = 60.55
    println(toDoubleVal)

    var toIntval = l.toInt()
    //toIntval =44
    println(toIntval)

}