package kotlin_oop
/*
* in single class we can added multiple interface*/
fun main() {
    val windows1 = Windows1()
    println(windows1.operatingSystem())
    println(windows1.buildBy())
    println(windows1.whoDevBy())
    println(windows1.typeOs())
}

interface Computers{
    fun operatingSystem():String
    fun buildBy():Int
    fun whoDevBy()="MircoSoft"
}
interface TypeOS{
    fun typeOs():String
}
class Windows1:Computers,TypeOS{
    override fun typeOs(): String {
        return "4th get"
    }

    override fun operatingSystem(): String {
        return "Windows 10"
    }

    override fun buildBy(): Int {
        return 2014
    }

}