package udemy

fun main(args:Array<String>){
  method1()
    foo1.invoke("sainath")
    foo2.invoke("hiwale","address",9503746253)
    foo3.invoke("sainath", "hiwale")
}

val method1={
  println("hello kotlin")
}
val foo1={ name:String ->
 println("my name is: $name")
}
val foo2={ surName:String , address:String, mobileNo:Long->

    var myResult:String = """
           | my surname is $surName
           | my address is $address
           | my mobile no is $mobileNo
    """.trimIndent()
    println(myResult.trimMargin())
}

val foo3={name:String,surName:String ->
    println("my name is $name" +
            " $surName")

}