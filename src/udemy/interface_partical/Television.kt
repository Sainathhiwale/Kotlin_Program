package udemy.interface_partical



class Television:Remote {
  private val TAG ="Television"
    override var name:String = "saianth"

    override fun ontv() {
        println("Remote : television is on")
    }

    override fun offtv() {
        println("Remote : television is off")

    }

    override fun volUp() {
        println("Remote : television volUp")

    }

    override fun volDown() {
        println("Remote : television volDown")

    }
    //nested class without create the object we can access the nested class data member and function member
    class TelevisionUsbPort{
        var  usbName:String =""
        var usbNo:Int =0

        fun usbPlug(){
            println("Nested class: USBPort usb is plugin to tv")
        }
    }

    //inner class we can access the outer class data member using inner keyword TAG varible
   inner class TelevisionTataPort{
        var  portName:String =""
        var portNo:Int =0

        fun usbPlugTata(){
            println("Inner class: Tata usb port is connected to tv")
        }
    }
}