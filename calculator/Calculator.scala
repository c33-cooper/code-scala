
object Calculator extends App {

	// Lambda integer function operations
	val sum = (x: Int, y: Int) => x + y
	val subtract = (x: Int, y: Int) => x - y
	val multiply = (x: Int, y: Int) => x * y
	val divide = (x: Int, y: Int) => x / y
	val modulus = (x: Int, y: Int) => x % y

	// Lambda double function operations
	val sumDouble = (x: Double, y: Double) => x + y
	val subtractDouble = (x: Double, y: Double) => x - y
	val multiplyDouble = (x: Double, y: Double) => x * y
	val divideDouble = (x: Double, y: Double) => x / y
	val modulusDouble = (x: Double, y: Double) => x % y

	val stringConcat = (string01: String, string02: String) => string01 + " " + string02

	// Calculator method
	def calculator[T](f: (T, T) => T, input01: T, input02: T): T = f(input01, input02)

	// Integer operations
	println("The sum of (134 + 10) = " + calculator[Int](sum, 134, 10))
	println("The subtract of (134 - 10) = " + calculator[Int](subtract, 134, 10))
	println("The multiplication of (134 * 10) is = " + calculator[Int](multiply, 134, 10))
	println("The division of (134 / 10) is = " + calculator[Int](divide, 134, 10))
	println("The modulus of (134 % 10) is = " + calculator[Int](modulus, 134, 10))

    // Double operations
	println("\nThe sum of (134.34 + 10.89) = " + calculator[Double](sumDouble, 134.34, 10.89))
	println("The subtract of (134.34 - 10.89) = " + calculator[Double](subtractDouble, 134.34, 10.89))
	println("The multiplication of (134.34 * 10.89) is = " + calculator[Double](multiplyDouble, 134.34, 10.89))
	println("The division of (134.34 / 10.89) is = " + calculator[Double](divideDouble, 134.34, 10.89))
	println("The modulus of (134.34 % 10.89) is = " + calculator[Double](modulusDouble, 134.34, 10.89))

	println(calculator[String](stringConcat, "Joe", "Bloggs"))
}