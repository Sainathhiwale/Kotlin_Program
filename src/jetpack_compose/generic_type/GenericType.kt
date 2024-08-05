package jetpack_compose.generic_type

fun main(args:Array<String>){
  val listOfItem = listOf("sainath","mahesh","Genesh","Pankaj")
    val finder = Finder( listOfItem)
    finder.findItem(element = "mahesh"){
        println("found:$it")
    }
}

class Finder(private val listOfElement: List<String>) {
    fun findItem(element: String, foundItem: (element: String?) -> Unit) {
        val itemFound = listOfElement.find { it == element }
        if (itemFound.isNullOrEmpty()) foundItem(null)else
        foundItem(itemFound)
    }
}