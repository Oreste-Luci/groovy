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
