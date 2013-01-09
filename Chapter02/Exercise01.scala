object Exercise01 {
    case class Box(height: Double, width: Double)

    def greaterBy(x: Box, y: Box, f: Box => Double): Box = 
        if (f(x) > f(y)) x else y

    def main(args: Array[String]): Unit = {
        val wider: (Box, Box) => Box = greaterBy(_, _, p => p.width)
        val taller: (Box, Box) => Box = greaterBy(_, _, p => p.height)

        val a = Box(3, 4)
        val b = Box(2, 5)

        println("Box a = " + a)
        println("Box b = " + b)
        println(wider(a, b) + " is wider.")
        println(taller(a, b) + " is taller.")
    }

}
