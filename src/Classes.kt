fun main()
{
    var dog = Dog("rock",69,"Mixed")
    println(dog.name)
    dog.weight=67
    dog.bark()

    var cat = Cat("cook",65,"Mixed")
    var catPet= Cat("cook",65,"Mixed",true)
    var catDefault= Cat("Jimmy")
    cat.makeSound()

    //Abstract class
    var vehicle : Vehicle = Car("race car",5)
    vehicle.drive();

    vehicle= Bike("honda Bike",5)
    vehicle.drive();

    vehicle  = Truck("Truck",5)
    vehicle.drive();
}