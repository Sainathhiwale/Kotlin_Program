package udemy

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args:Array<String>){

    var listOfNum = intArrayOf(30,49,60,50,20)

    if (30 in listOfNum){
        println("30")
    }
    if (10 in listOfNum){
        println("10")
    }
    if (10 !in listOfNum){
        println("10 is not in list ")
    }

    if (listOfNum.contains(50)){
        println("50")
    }
    if (!listOfNum.contains(5)){
        println("5 is not in list")
    }
}