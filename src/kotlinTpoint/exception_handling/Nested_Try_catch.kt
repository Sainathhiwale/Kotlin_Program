package exception_handling

fun main(args:Array<String>){

    val name = intArrayOf(4, 8, 16, 32, 64, 128, 256, 512)
    val deno = intArrayOf(2, 0, 4, 4, 0, 8)

    try {
        for (i in name.indices){
            try {
                println(name[i].toString()+" / "+deno[i]+" is "+name[i]/deno[i])
            }catch (exc:ArithmeticException){
                println(exc)
            }
        }
    }catch (ex:ArrayIndexOutOfBoundsException){
        println("element is not found!"+ex)
    }

}