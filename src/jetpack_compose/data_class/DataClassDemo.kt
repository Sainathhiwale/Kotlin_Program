package jetpack_compose.data_class

fun main(args:Array<String>){

    val person = Person(23,"Sainath","Pune")
    val person2 = Person(44,"ganesh","Pune")
    val listOfItem = listOf(person, person2, Person(33,"Mahesh","Pune"))
    // print the list element through the lambda
    listOfItem.forEach{ person ->
        println("Person data class value is: ${person.age} ${person.address} ${person.name}")
    }
}