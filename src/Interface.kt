fun main()
{
    var product : Discountable = DigitalProduct()
    println(product.discountPercent())
    product.foo()

    product  = GenericProduct()
    println(product.discountPercent())
    product.foo()

}

interface Discountable{
    fun discountPercent():Double
    fun foo()
}

class DigitalProduct : Discountable{
    override fun discountPercent(): Double =10.7

    override fun foo() {
        println("Digital Product")
    }

}

class GenericProduct : Discountable{
    override fun discountPercent(): Double=20.5
    override fun foo() {
    println("Generic Product")
    }

}