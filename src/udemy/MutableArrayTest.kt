package udemy

fun main(args:Array<String>){
    val array = arrayOf(1,2,3,4,5,6,7)
    var array2 = arrayOf<String>("apple","boy","cat","dog")
    var array3 = intArrayOf(1,2,3,4,5,6,7)
    var array4 = booleanArrayOf(false,true,true)
    var array5 = floatArrayOf(34.4f,45.5f,67.7f)
    var array6 = longArrayOf(3,5,6,7,7898765)
    var array7 = arrayOf<Int>(3,5,6,7,9)

    var array9 = Array(5){0} // 0 means int data type
    var array10 = Array(6){""}

    var array8 = arrayOf(1,2,3,4,5,6,7 ,"apple","boy","cat","dog",34.4f,45.5f,67.7f ,345645,4567456,678765)

    for (i in array8){
        println("array8 of values $i")
    }
    for (i in array){
        println("before array values:$i")
    }
    //set value to array using index
    array.set(0,10)
    array[1]= 20
    println("after change array values:${array.get(0)} : ${array.get(1)}")


    //string array get
    println("array of string values ${array.get(0)}")

    //set value to array9 and array10
    array9.set(0,10)
    array9.set(1,20)
    array9.set(2,30)
    array9.set(3,40)
    array9.set(4,50)

    for (i in array9){
     println("array10 value is: ${i}")
    }
    array10.set(0,"apple")
    array10.set(1,"dog")
    array10.set(2,"cat")
    array10.set(3,"monkey")
    array10.set(4,"snake")
    array10.set(5,"animal")
    for (i in array10){
        println("array10 value is: ${i}")
    }

    for (element in 0..array8.size-1){
        println("array8 is index :${element} value ${array8[element]} ")
    }


}