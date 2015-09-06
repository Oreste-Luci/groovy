/**
 * @author Oreste Luci
 */

// We call the createGreeter closure and pass the name World to it. This closure will basically return a new closure, which we store in the variable greetWorld. Whenever we call greetWorld now we will get a nice message depending on whether it’s weekend or not. We never passed the content of the name variable to the inner closure, that we return and store in greetWorld. We still can access it from inside the closure, because that is what being a closure means. It has access to the variables of the context it was defined in. In this case it was defined somewhere where a variable name exists. The closure can use this variable even once it got returned and called somewhere completely different.

def createGreeter = { name ->
  return {
    def day = new Date().getDay()
    if (day == 0 || day == 1) {
      println "Nice Weekend, $name"
    } else {
      println "Hello, $name"
    }
  }
}
def greetWorld = createGreeter("World")

greetWorld()

