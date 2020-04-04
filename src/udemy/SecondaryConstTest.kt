package udemy

class SecondaryConstTest {
    var empName =""
    var empNo = 0
    var address =""
    var mobileNo =0L
    // secondary constructor initilaize the class lavel varible to constructor using ' this ' Keyword
    constructor(empName: String, empNo: Int, address: String, mobileNo: Long) {
        this.empName = empName
        this.empNo = empNo
        this.address = address
        this.mobileNo = mobileNo
    }

    constructor(empName: String, empNo: Int, address: String) {
        this.empName = empName
        this.empNo = empNo
        this.address = address
    }

    fun display(){
        val empResult = """
            |my emp name is: ${empName}
            |my emp No is:: ${empNo}
            |my emp Address is: ${address}
            |my emp MobileNo is: ${mobileNo}
        """.trimIndent()
        println("emp Display: ${empResult.trimMargin()}")
    }

    fun details(){
        val empResult = """
            |my emp name is: ${empName}
            |my emp No is: ${empNo}
            |my emp Address is: ${address}
        """.trimIndent()
        println("emp Deatils: ${empResult.trimMargin()}")
    }
}