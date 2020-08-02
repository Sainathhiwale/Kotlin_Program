package lambda_function

fun main(args:Array<String>){
    val result:(String,String)->String={s1,s2->"$s1 and $s2"}
    myfun("examen.com","quiz app",result)
}

fun myfun(s: String, s1: String, result: (String, String) -> String) {
  val re= result(s,s1)
    println(re)
}
