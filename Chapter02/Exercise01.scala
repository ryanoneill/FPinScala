object Exercise01 {
    case class Box(height: Double, width: Double)

    def greaterBy(x: Box, y: Box, f: Box => Double): Box = 
        if (f(x) > f(y)) x else y

    def wider(x: Box, y: Box): Box =
        greaterBy(x, y, _.width)

    def taller(x: Box, y: Box): Box =
        greaterBy(x, y, _.height)

    def main(args: Array[String]): Unit = {
        val a = Box(3, 4)
        val b = Box(2, 5)

        println("Box a = " + a)
        println("Box b = " + b)
        println(wider(a, b) + " is wider.")
        println(taller(a, b) + " is taller.")
    }

}
