import kotlin.collections.*
fun main()
{
    val welcome ={name : String->"Hello $name"}
    val result = welcome("Rex")
    var baseValue=2
    println(result)
   // val isEven : (Int)->Boolean = {num : Int -> num%2==0}
    val isEven:(Int)->Boolean={it%2==0}

    var list : List<Int> = listOf(2,4,5,14,67,23)
    list.map { n : Int -> print("$n ")}
    list.map { print("$it ")}
    println()
    list.joinToString("-") { "$it" }.forEach { print("$it") }
    println()
    list.mapIndexed {index, element -> "$index-$element " }.forEach { print("$it")}
    println()
    //Captures (Lambda function can access and manipulate the values which are declared outside the scope of the function
    list.filter(isEven).filter { it>baseValue }
        .forEach { print("$it ") }
    var (odd,even) = list.partition { it%2!=0 }
    println()
    print(odd+" "+even)
    val min = list.minByOrNull{it}
    println(min)
    val intRange = 1..3
    //o/p is list of list
    intRange.map { a->intRange.map{b->"$a-$b" }}.forEach { print("$it\n") }
    //flat list
    intRange.flatMap { a->intRange.map{b->"$a-$b" }}.forEach { print("$it ") }
    println()
    //Extension lambdas
    var repeat : (String,Int)->Unit = {str,int -> repeat(int){ print(str)} }
    var repeat1 : String.(Int)->Unit = {int -> repeat(int) {print(this)} }
    repeat("hi",3)
    println()
    "hi".repeat1(3)
    println()

    //calling the returned function
    localFun("local")("local1")

}
//function returning a function
fun localFun(name:String):(String)->Unit{
    var func={string : String -> println(string)}
    func(name)
    return func
}
