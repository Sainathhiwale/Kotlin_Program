package default_name_argument
/*Kotlin Default Argument
Kotlin provides a facility to assign default argument (parameter) in a function definition.
If a function is called without passing any argument than default argument are used as parameter of function definition.
And when a function is called using argument, than the passing argument is used as parameter in function definition.
*/
fun main(args:Array<String>){
    run()
}

fun run(num:Int=5,ch:Char ='S',str:String="sai") {
 println("parameter in function defination $num and $ch and $str ")
}
