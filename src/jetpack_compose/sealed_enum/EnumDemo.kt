package jetpack_compose.sealed_enum

fun main(args: Array<String>){

    val result = Result.SUCCESS
    getResult(result)
}
fun getResult (result: Result){
    return when(result){
        Result.SUCCESS -> {
         println("Success!")
        }
        Result.FAILURE ->{
         println("failure")
        }
        Result.ERROR ->{
        println("error")
        }
    }
}

enum class Result{
    SUCCESS,
    FAILURE,
    ERROR
}