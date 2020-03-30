package udemy

fun  main (args:Array<String>){
    var myBoolean1:Boolean = true;
    var myBoolean2:Boolean = false;

    if (myBoolean1){
        println("the boolen value is true")
    }else{
        println("the boolen valus is flase")
    }
    if (myBoolean2){
        println("the second boolen is true")
    }else{
        println("the second boolen is flase")
    }
    myBoolean2 = true
    if (myBoolean2){
        println("it is true")
    }else{
        println("it is false")
    }
}