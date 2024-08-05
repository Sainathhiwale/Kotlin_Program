package connect_kotlin.destructuring
//https://blog.mindorks.com/learn-kotlin-destructuring-declarations/
fun main(array: Array<String>){
    // Get a developer object using the getDeveloper function
    val developer = getDeveloper()

    // Accessing elements using destructuring declaration
    val (name, age) = developer

    // Print the details
    println("Developer Name: $name")
    println("Developer Age: $age")
}
fun getDeveloper(): Developer {
    // Simulate some logic (replace with your actual logic)
    val name = "Alice"
    val age = 30
    return Developer(name, age)
}
