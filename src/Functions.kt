fun main(){
    var num1 = 5
    var num2 = 3
    printSum(num1 = num1, num2 = num2)

    printAutourName("Hello kotlin ","Roy","sam","kumar")

    println("The sum is ${getSum(num1,num2)}")

    for(x in 1..10)
        print("$x ")
    println()
    for(x in 5 until 10)
        print("$x ")
    println()
    for(x in 15 downTo 10) print("$x ")
}
fun printSum(num1:Int,num2:Int):Unit
{
    println("The sum is ${num1+num2}")
}

fun getSum(num1:Int,num2:Int)=num1+num2

fun printAutourName(bookName:String , vararg authors : String)
{
    println("${authors.toString()}")
    authors.forEach { println(it) }
}
