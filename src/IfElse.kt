fun main()
{
    var num1 = 5
    val num2 : Int = 6
    if(num1>num2)
    {
        println("Num1 is greater than num1")
    }
    else {
        println("num2 is greater than num1")
    }
    println(if(num1>num2)"Num1 is greater" else "num2 is greater")

    var name = "Jashwin"
    var name1 = "Jashwin"
    println(name == name1)

    var a:Int = 7
    var b:Long = 5
    var c:Float = 5.7f
    b=a.toLong()
    println(c.toInt())

    var array1 = arrayOf("hello","world","of")
    var array2 : Array<Int> = arrayOf(3,43,45,5)
    println(array1.size)
    println("My array id ${if(array1.size>5) "large" else "small"}")
    for(word in array1)
        println(word)





}