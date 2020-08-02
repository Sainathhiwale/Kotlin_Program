package recursion

fun main(args: Array<String>) {
    var number = 100000.toLong()
    var result = recursiveSum(number)
    println("sun of upto $number number = $result")
}
tailrec fun recursiveSum(n: Long, semiresult: Long = 0) : Long {
    return if (n <= 0) {
        semiresult
    } else {
        recursiveSum( (n - 1), n+semiresult)
    }
}