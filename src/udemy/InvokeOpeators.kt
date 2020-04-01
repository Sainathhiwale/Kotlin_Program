package udemy

fun main(args:Array<String>){
  method1()
    foo1.invoke("sainath")
    foo2.invoke("hiwale","address")
}

val method1={
  println("hello kotlin")
}
val foo1={ name:String ->
 println("my name is: $name")
}
val foo2={ surName:String , address:String ->
    println("my surname is $surName")
    println("my address is $address")

}