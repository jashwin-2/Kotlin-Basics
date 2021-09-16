fun main()
{
    var start = 0
    var stop = 10
    for (i in start until stop) print("$i ")
    println(" ")
    for (i in start until stop step 2) print("$i ")
    println()
    for(i in 1..10) print("$i ")
    println()
    var x=0
    while (x<10)
    {
        print("$x ")
        x++
    }
}