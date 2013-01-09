object Exercise05 {
    type Pred[A] = A => Boolean

    def divisibleBy(k: Int): Pred[Int] = 
         (n: Int) => n % k == 0

    def main(args: Array[String]): Unit = {
        val even = divisibleBy(2)
        println("36 is even: " + even(36))
        println("1 is even: " + even(1))
    }
}
