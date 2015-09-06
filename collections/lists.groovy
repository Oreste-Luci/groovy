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
def printList = list.each {
  print it + " "
}

// To filter a list you can use the method findAll:
def even = list.findAll { it % 2 == 0 }



