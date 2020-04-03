package udemy

fun main(args:Array<String>){

    var mList = mutableListOf<Int>()
    mList.add(1)
    mList.add(2)
    mList.add(3)
    mList.add(4)
    for (i in 0..mList.size-1){
        println("mlist index is: ${i} values :${mList[i]}")
    }
    //add more item in same mlist  becaucse it is not fixed it's growable nature
    println("new mutable list ")
    mList.add(5)
    for (i in 0..mList.size-1){
        println("mlist index is: ${i} values :${mList[i]}")
    }
    //get specific index value
    println("mList is: ${mList.get(2)}")

    var mlist2 = mutableListOf("apple","cat","dog","fish")
    for (element in 0..mlist2.size-1){
        println("mList2 index is: ${element} values ${mlist2[element]}")
    }

    //get any generic tyep data type using Any keyword

    var mList3 = mutableListOf<Any>()
    mList3.add(1)
    mList3.add(10.4f)
    mList3.add(10.44)
    mList3.add('c')
    mList3.add(false)


    //get any generic tyep data type using Any keyword
    var mList4 = mutableListOf<Any>()
    mList4.add(1)
    mList4.add(10.4f)
    mList4.add(10.44)
    mList4.add("apple")
    mList4.add('c')
    mList4.add(false)

    // add other mutablelist object into list4
    mList4.addAll(mlist2)
    mList4.addAll(mList3)
    for (element in 0..mList4.size-1){
        println("mlist4 index  ${element} values : ${mList4[element]}")
    }

    //remove the specific index value into mlist4 using remove() function
    println("after remove function mlist4")
    mList4.remove("apple")
    for (element in 0..mList4.size-1){
       println( "mList4 remove index is: ${element} values ${mList4[element]}")
    }

    mList4.removeAt(0)
    for (element in 0..mList4.size-1){
        println( "mList4 removeAt index is: ${element} values ${mList4[element]}")
    }

    //add value into mlist4
    mList4.add(1,"sainath")
    for (element in 0..mList4.size-1){
        println( "mList4 removeAt index is: ${element} values ${mList4[element]}")
    }

    //remove whole list3
    mList4.removeAll(mList3)
    println("mlist4 size: ${mList4.size}")

    mlist2.removeAll(mlist2)
    println("mlist2 size: ${mlist2.size}")

    //clear() function
    mList4.clear()
    println("clear() mlist4 :${mList4.size}")

}