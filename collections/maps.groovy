/**
 * @author Oreste Luci
 */

def key = 'Key3'
def aMap = [
        'Key1': 'Value 1', // Put key1 -> Value 1 to the map
        Key2: 'Value 2', // You can also skip the quotes, the key will automatically be a String
        (key): 'Another value' // If you want the key to be the value of a variable, you need to put it in parentheses
]

// After this initialization you will get a new LinkedHashMap with the entries: Key1 -> Value1, Key2 -> Value 2, Key3 -> Another Value. If you want to create an empty map with this syntax you can write: def map = [:]
println aMap['Key1'] // Access the key Key1
println aMap[key] // Access the entry with the value of key variable

// Beside using brackets you can also use dot notation to access entries:
println aMap.Key1 // Access Key1 entry

// If the key has characters in it, that can’t be parsed as an identifier (e.g. a space) you can still use the dot syntax with quotes around it: aMap.'Key With Spaces'. Since in my opinion this looks kind of strange I don’t give it its own box. You can even use interpolated Strings with this syntax, like: aMap."$key", which is the same as aMap[key].

// Transforming and Filtering
println "\nTransforming and Filtering"
aMap.each {
    print it.key
    print ", "
    print it.value
    println " "
}

//Instead of the value you will get the entry of the map on which you can access the key and value as shown above. The each method can also take a closure with two parameters in which case it will put key and value into these parameters. So you could express  the above also as:
println " "
aMap.each { k, v ->
    print k
    print ", "
    print v
    println " "
}