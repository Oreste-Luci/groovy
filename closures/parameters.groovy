/**
 * @author Oreste Luci
 */

def power = { int x, int y ->
  return Math.pow(x, y)
}
println power(2, 3) // Will print 8.0

// Type definition of parameters is the same like variables. If you define a type you can only use this type, but you can also skip the type of parameters and pass in anything you want:
def say = { what ->
  println what
}
say "Hello World"

// If you don’t specify any parameters (and no arrow) the closure can except one parameter which is available by the name it inside of the closure. That way you can make often used one parameter closures even shorter, e.g. you can shorten the above to the following (which will produce exactly the same result):
def sayIt = { println it }
sayIt "Hello World"

// If you don’t pass the parameter, it will just be null. If you really want to create a closure that won’t be able to take an argument, you have to write the following:
def clos = { ->
  println "This closure does not take any arguments."
}
clos()
