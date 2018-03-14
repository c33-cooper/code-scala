
object Calculator extends App {

	// Lambda function operations
	val sum = (x: Double, y: Double) => x + y

	val subtract = (x: Double, y: Double) => x - y

	val multiply = (x: Double, y: Double) => x * y

	val divide = (x: Double, y: Double) => x / y

	val modulus = (x: Double, y: Double) => x % y

	// Calculator method
	def calculator(f: (Double, Double) => Double, input01: Double, input02: Double) = f(input01, input02)

	println("The sum of (134 + 10) = " + calculator(sum, 134, 10))
	println("The subtract of (134 - 10) = " + calculator(subtract, 134, 10))
	println("The multiplication of (134 * 10) is = " + calculator(multiply, 134, 10))
	println("The division of (134 / 10) is = " + calculator(divide, 134, 10))
	println("The modulus of (134 % 10) is = " + calculator(modulus, 134, 10))

}