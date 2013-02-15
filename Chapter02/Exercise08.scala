object Exercise08 {

    def uncurry[A, B, C](f: A => B => C): (A, B) => C =
        (x: A, y: B) => f(x)(y)

    def curried_mult(x: Int)(y: Int) = x * y

    def main(args: Array[String]): Unit = {
        println("4 * 5 via curried_mult(4)(5): " + curried_mult(4)(5))
        println("9 * 7 via curried_mult(9)(7): " + curried_mult(9)(7))
        val my_multiply = uncurry(curried_mult)
        println("4 * 5 via my_multiply(4, 5):  " + my_multiply(4, 5))
        println("9 * 7 via my_multiply(9, 7):  " + my_multiply(9, 7))
        println
    }

}
