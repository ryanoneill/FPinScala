object Exercise02 {
    def abs(n: Int): Int = 
        if (n < 0) -n else n

    def absolute(f: Int => Int): Int => Int =
        n => abs(f(n))

    def main(args: Array[String]): Unit = {
        val abs5minus = absolute(p => p - 5)
        println(abs5minus(-10))
    }
}
