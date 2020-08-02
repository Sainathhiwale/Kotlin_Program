package default_name_argument
/*A named argument is an argument in which we define the name of argument in the function call. The name defined to argument of function call checks the
 name in the function definition and assign to it.*/
fun main(args:Array<String>){
   // run1('a') Error: Kotlin: The character literal does not conform to the expected type Int
    run1(latter = 'a')
}

fun run1(num:Int =5 ,latter: Char='b') {
    print("parameter in function definition $num and $latter")

}
