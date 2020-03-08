class Emp{
    fun display(id:Int,name:String,address:String,mobileno:Long){
        println("emp Id: $id emp name: $name emp address: $address emp mobileno: $mobileno")
    }
}
fun main(args:Array<String>){
    val obj = Emp()
    obj.display(803,"Sainath","Pune",9503746253)
}