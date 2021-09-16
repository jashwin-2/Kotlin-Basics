import java.util.*

class Cat(name: String, weightParam : Int, breed: String, isPet : Boolean){
    constructor(name : String,weightParam: Int,breed: String ): this(name,weightParam,breed,false){
        println("Pet is false by default")
    }
    constructor(name : String) : this(name,56,"Mixed"){
        println("Assigning the default values")
    }
    fun makeSound()
    {
        println("Meow Meow..")
    }
}