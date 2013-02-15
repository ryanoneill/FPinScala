object Exercise09 {

    def compose[A, B, C](f: B => C, g: A => B): A => C =
        (x: A) => f(g(x))

    def myToString(x: Int) = x toString

    def myToInt(x: String) = x toInt

    def main(args: Array[String]): Unit = {
        val int_composed = compose(myToInt, myToString)
        println("int_composed(4): " + int_composed(4))
        println("int_composed(9): " + int_composed(9))

        val string_composed = compose(myToString, myToInt)
        println("""string_composed("4"): """ + string_composed("4"))
        println("""string_composed("7"): """ + string_composed("7"))
        println
    }

}
