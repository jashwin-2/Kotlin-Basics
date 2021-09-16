import java.util.*
import kotlin.collections.ArrayList

fun main()
{
    var list : List<String> = listOf("hi","hello","world")
    var filterList = list.filter { it.lowercase(Locale.getDefault()).contains('h')}
    for(word in list) print("$word ")
    println("------")
    println(filterList)
    var ages : List<Int> = listOf(12,23,25,17,19,10)
    var adults:List<Int> = ages.filter(::isAdult)
    println(adults)

    val muList : MutableList<String> = mutableListOf("rock","Tom","Jimmy")
    muList[2] = "Ram"
    muList.addAll(list)
    muList.add(1,"Felix")
    println("Applying map")
    muList.map { it.substring(0,2).uppercase(Locale.getDefault()) }.filter { it.contains('O') }.forEach{ print("$it ")}
    println()
    muList.sort()
    for(word in muList) print("$word ")
    println()
    muList.shuffle()
    for(word in muList) print("$word ")
    var numbList = ArrayList<Int>()


 //   var names = setOf<String>("Don","John","Carry","Don")
    var names:MutableSet<String> = mutableSetOf<String>("Don","John","Carry","Don")
    names.add("Rex")
    names.add("John")
    println(names)

    //MAP
    var citys : Map<String,String> = mapOf(
        "NY" to "NewYork",
        "NJ" to "New jersey",
        "CA" to "California"
  )
    println(citys["NY"])
    var entries = citys.entries
    println(entries)



}

fun isAdult(value : Int) : Boolean{
    //
    //
    //
    return value>=18
}