package kotlin_oop

fun main(){
    val windows = Windows()
    val mac = Mac()
    println(windows.operatingSystem())
    println(mac.operatingSystem())
    println("=========================")
    println(getOperatingSystem(mac))
    println(getOperatingSystem(windows))
}
fun getOperatingSystem(computer: Computer) = computer.operatingSystem()
abstract class Computer{
    abstract fun operatingSystem():String
   

}

 class Windows: Computer(){
     override fun operatingSystem(): String {
         return "Windows OS"
     }

 }
class Mac : Computer() {
    override fun operatingSystem(): String {
        return "MAC OS"
    }

}