object Exercise06 {
    type Pred[A] = A => Boolean

    def divisibleBy(k: Int): Pred[Int] = 
         (n: Int) => n % k == 0

    def lift[A](f: (Boolean, Boolean) => Boolean,
        g: Pred[A], h: Pred[A]): Pred[A] = {
        (n) => f(g(n), h(n))
    }

    def main(args: Array[String]): Unit = {
        val threeAndFive = lift(_ && _, divisibleBy(3), divisibleBy(5))
        println("30 is divisibleBy3and5: " + threeAndFive(30))
        println("18 is divisibleBy3and5: " + threeAndFive(18))
        println

        val threeOrFive = lift(_ || _, divisibleBy(3), divisibleBy(5))
        println("30 is divisibleBy3or5: " + threeOrFive(30))
        println("18 is divisibleBy3or5: " + threeOrFive(18))
        println("15 is divisibleBy3or5: " + threeOrFive(15))
        println("17 is divisibleBy3or5: " + threeOrFive(17))
        println
    }
}
