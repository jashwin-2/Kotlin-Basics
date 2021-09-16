fun main()
{
    var age : Int? =5
    age=null
    var name : String?="Don"
    var length = name?.length // null or three
    var length2= name?.substring(0,2)?.length ?:0 //Elvis

    var length1 = if(name!=null) name.length else 0
    println(length2)



}
data class person(var name:String)