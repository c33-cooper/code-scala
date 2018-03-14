
object Calculator extends App {

	// Lambda integer function operations
	val sum: (Int, Int) => (Int) = (x, y) => x + y
	val subtract: (Int, Int) => (Int) = (x, y) => x - y
	val multiply: (Int, Int) => (Int) = (x, y) => x * y
	val divide: (Int, Int) => (Int) = (x, y) => x / y
	val modulus: (Int, Int) => (Int) = (x, y) => x % y

	// Lambda Double function operations
	val sumDouble: (Double, Double) => (Double) = (x, y) => x + y
	val subtractDouble: (Double, Double) => (Double) = (x, y) => x - y
	val multiplyDouble: (Double, Double) => (Double) = (x, y) => x * y
	val divideDouble: (Double, Double) => (Double) = (x, y) => x / y
	val modulusDouble: (Double, Double) => (Double) = (x, y) => x % y

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

    // Lambda string concatenation functions
	val concatString: (String, String) => (String) = (input01, input02) => input01 + " " + input02

	// String method
	def stringOperator[T](f: (T, T) => T, input01: T, input02: T): T = f(input01, input02)

    // String operations
	println("\nThe two strings 'Joe' & 'Bloggs' concatenated are " + stringOperator[String](concatString, "Joe", "Bloggs"))
}