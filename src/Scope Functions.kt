fun main()
{
    //let(),run(),with(),apply() and also()


        // let(): Access object with 'it'
        // Returns last expression in lambda
       print( Tag(1).let {
            it.s = "let: ${it.n}"
            it.increment()
        } )
        // let() with named lambda argument:
        println(Tag(2).let { tag ->
            tag.s = "let: ${tag.n}"
            tag.increment()
        } )
        // run(): Access object with 'this'
        // Returns last expression in lambda
        println(Tag(3).run {
            s = "run: $n" // Implicit 'this'
            increment() // Implicit 'this'
        } )
        // with(): Access object with 'this'
        // Returns last expression in lambda
       println( with(Tag(4)) {s = "with: $n"
            increment()
        })
        // apply(): Access object with 'this'
        // Returns modified object
        println(Tag(5).apply {
            s = "apply: $n"
            increment()
        } )
        // also(): Access object with 'it'
        // Returns modified object
        println(Tag(6).also {
            it.s = "also: ${it.n}"
            it.increment()
        } )
        // also() with named lambda argument:
       println( Tag(7).also { tag ->
            tag.s = "also: ${tag.n}"
            tag.increment()
        } )
    }

data class Tag(var n : Int=0){
    var s = ""
    fun increment() = n++
}
