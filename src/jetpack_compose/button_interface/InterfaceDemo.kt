package jetpack_compose.button_interface

import Test


fun main(args:Array<String>){

    val obj = Test()


}

interface OnClickEvent{
    fun onClick(label: String)
}
class Test : OnClickEvent{
    override fun onClick(label: String) {
        println(message = "Hello" )
    }

}

