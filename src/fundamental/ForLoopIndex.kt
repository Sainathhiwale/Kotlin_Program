package fundamental

fun main(args:Array<String>){

    var array = arrayOf(1,2,3,4,5,6,7 ,"apple","boy","cat","dog",34.4f,45.5f,67.7f ,345645,4567456,678765)

    for (i in 0..array.size-1){
        println("array of index ${i} values: ${array[i]}")
    }
}