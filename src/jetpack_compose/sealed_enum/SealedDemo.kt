package jetpack_compose.sealed_enum

import java.lang.Exception


fun main(args:Array<String>){
    // Example usage:
    val result: FetchResult = Success("Data fetched successfully")
    when (result) {
        is Success -> println("Data fetched: ${result.dataFetched}")
        is Error -> println("Error occurred: ${result.exception.message}")
        NotLoading -> println("Not loading")
        Loading -> println("Loading...")
    }
}

sealed class FetchResult
data class Success(val dataFetched: String?) : FetchResult()
data class Error(val exception: Exception) : FetchResult()
object NotLoading : FetchResult()
object Loading : FetchResult()