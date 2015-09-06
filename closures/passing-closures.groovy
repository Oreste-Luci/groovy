/**
 * @author Oreste Luci
 */

// The power of being able to assign closures to variable is that you can also pass them around to methods. Let’s write a closure (you could of course do the same to class methods) which will expect a closure as a parameter and a string:
def transform = { str, transformation ->
  transformation(str)
}

// Your transform function now can be called with a string and a closure. The transform function will just call the passed closure with the passed string (what makes it a pretty useless example).
println transform("Hello World", { it.toUpperCase() })


