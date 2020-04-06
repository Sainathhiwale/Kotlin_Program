package udemy.interface_partical

import sun.rmi.runtime.Log

interface Remote {
    var name:String //abstract property

    fun ontv()
    fun offtv()
    fun volUp()
    fun volDown()
    fun startTv(){
        println("start tv")
    }

}