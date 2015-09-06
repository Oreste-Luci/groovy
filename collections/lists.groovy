// This will create an ArrayList with the given numbers in it.
def list = [1,1,2,3,5]

// To access a list element you can use the overloaded array index accessor:
println list[0] // will print 1
println list[2] // will print 2
println list[-1] // negative indexes for access from the end of the lsit, will print out 5
println list[-2]


// To check whether a specific element is contained inside a list you can use the in operator:
if (3 in list) {
    println "3 is in the list"
}

// To iterate over a list you can use the each method on a list:
// The passed closure will be executed once for each element in the list and the list element will be passed as a parameter (here implicitly it) to the closure.
list.each {
  print it + " "
}

def printListElements = { l ->
    println " "
    l.each {print it + " "}
}

// To filter a list you can use the method findAll:
def even = list.findAll { it % 2 == 0 }
printListElements(even)

/**
 * @author Oreste Luci
 */

// If you are just interested in the first element of the list that matches a given criteria, you can use the find method instead. It also takes a closure and will return the first element for which the closure evaluates to true.
def three = list.find { it == 3 }
println "\n" + three

// If you need to transform each element of a list you can use the collect method:
def squaredList = list.collect { it * it }
printListElements(squaredList)

// If the only transformation you want to do in the collect closure is calling a method on each element, like in the following:
def upper = ["Hello", "World"].collect { it.toUpperCase() }
printListElements(upper)

// For these cases Groovy has again a syntactic sugar operator called the spread-dot operator. You can express the above with the operator as follow:
def upper2 = ["Hello", "World"]*.toUpperCase()
printListElements(upper2)

// Any
def list2 = [2, 4, 8, 16, 32]
def number32 = list2.any { it == 32}
println "\n" + number32

// Every
def everyEven = list2.every { it % 2 == 0 }
println everyEven


