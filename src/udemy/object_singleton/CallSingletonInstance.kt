package udemy.object_singleton

import udemy.data_class.StudentInfo

fun main(args:Array<String>){

    var  obj = StudentInfo("sainath",33,"Pune")

    val sobj = DatabaseService.create(obj)
    println(sobj.toString())
}