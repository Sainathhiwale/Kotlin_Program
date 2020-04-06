package udemy.object_singleton

import udemy.data_class.StudentInfo

object DatabaseService {

    var con:String ="Db"

    fun create(std:StudentInfo):StudentInfo{

        return StudentInfo(std.name,std.roleNo,std.address)
    }
}