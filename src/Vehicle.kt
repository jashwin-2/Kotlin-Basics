abstract class Vehicle(var name:String,var noOfWheeles : Int){
    abstract fun drive()
    fun openDoor()
    {
        println("Door opened")
    }
}
class Car(name : String,noWheels: Int) : Vehicle(name,noWheels)
{
    override fun drive() {
        println("Driving Car ....")
    }

}

class Bike(name : String,noWheels: Int) : Vehicle(name,noWheels)
{
    override fun drive() {
        println("Riding Bike ....")
    }

}

class Truck(name : String,noWheels: Int) : Vehicle(name,noWheels)
{
    override fun drive() {
        println("Driving Truck ....")
    }

}