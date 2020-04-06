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
}