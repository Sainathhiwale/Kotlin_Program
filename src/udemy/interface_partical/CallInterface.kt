package udemy.interface_partical

fun main(args:Array<String>){

    var obj = Television()
    obj.name="ganesh"
    obj.ontv()
    obj.offtv()
    obj.volDown()
    obj.volUp()
    obj.startTv()

    //calling nested class
    var nestObj = Television.TelevisionUsbPort()
    nestObj.usbName ="Nokia"
    nestObj.usbNo =1112
    println("usb port is ${nestObj.usbNo} and ${nestObj.usbName}")
    nestObj.usbPlug()

    // acess the inner class data member and function member using constructor
    // var innerObj = Television.TelevisionTataPort() error because constructor
    var innerObj = Television().TelevisionTataPort()
    innerObj.portName ="tata sky"
    innerObj.portNo = 444
    innerObj.usbPlugTata()
}
