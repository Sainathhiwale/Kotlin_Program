package udemy

class PrimaryConstructorTest constructor(  name:String,   mobileno:Long,  address:String) {
    var name = name
    var mobileno =mobileno
    var address = address

    fun empDisplay(){
        val result = """
            |my name is :${name}
            |my mobileno is :${mobileno}
            |my address is :${address}
        """.trimIndent()
        println("the result of emp data:${result.trimMargin()}")
    }

}