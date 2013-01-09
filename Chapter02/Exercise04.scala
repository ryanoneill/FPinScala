object Exercise04 {
    type Pred[A] = A => Boolean

    def divisibleBy(k: Int): Pred[Int] = 
         (n: Int) => n % k == 0

    def main(args: Array[String]): Unit = {
        val multipleOf3 = divisibleBy(3)
        println("9 is divisibleBy 3: " + multipleOf3(9))
        println("7 is divisibleBy 3: " + multipleOf3(7))
    }
}
