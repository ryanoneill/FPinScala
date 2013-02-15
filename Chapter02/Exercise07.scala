object Exercise07 {

    def curry[A, B, C](f: (A, B) => C): A => B => C =
        (x: A) => ((y: B) => f(x, y))

    def my_multiple(x: Int, y: Int) = x * y

    def main(args: Array[String]): Unit = {
        println("4 * 5 via my_multiple(4, 5):  " + my_multiple(4, 5))
        val curried_mult = curry(my_multiple)
        println("4 * 5 via curried_mult(4)(5): " + curried_mult(4)(5))
        val mult_by_4 = curried_mult(4)
        println("4 * 5 via mult_by_4(5):       " + mult_by_4(5))
        println("4 * 7 via mult_by_4(7):       " + mult_by_4(7))
        println
    }

}
