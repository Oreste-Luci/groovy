/**
 * @author Oreste Luci
 */

// In Groovy the last statement of a method block (or closure) is returned implicitly without you needing to write the return statement. This can be useful to reduce boilerplate code to a minimum. A closure that calculates the square of a number, can be shortened as follows:
def square = { it * it }
println square(4) // Will print out 16

