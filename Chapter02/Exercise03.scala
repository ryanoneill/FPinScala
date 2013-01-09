object Exercise03 {
    def abs(n: Int): Int = 
        if (n < 0) -n else n

    def absolute[A](f: A => Int): A => Int =
        n => abs(f(n))

    def main(args: Array[String]): Unit = {
        println(absolute((p: Int) => p)(-10))
        println(absolute((p: Double) => p.toInt)(5.5))
    }
}
