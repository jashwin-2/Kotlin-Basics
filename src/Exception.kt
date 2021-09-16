fun main()
{
        try {
                val result = 123 / 0
        }
        catch (ex : ArithmeticException) {
                println(ex)
        }
}
