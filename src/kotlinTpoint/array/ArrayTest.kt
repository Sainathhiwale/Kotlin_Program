package array

fun main(args:Array<String>){

    val ary = arrayOf(2,5,6,7,"sai",3.4,12536456)
    ary[0] = 1
    ary[4]="pankaj"
    for (element in ary){
        println(element)
    }

}