# Groovy Basics

## Implicit Truthy

Like JavaScript Groovy evaluates every object to a boolean value if required (e.g. when using it inside an if or when negating the value).

    if("foobar") ...
    if(42) ...
    if(someObject) ...

All these statements are valid ifs. Groovy uses the following rules to convert any type to boolean:

* Strings: If empty false, otherwise true
* Collections and Maps are true if they are not empty
* All non-zero numbers are true
* Matchers (from a regular expression check) are true if they found at least one match (see next chapter)
* Iterators with further elements are true
* Object references are true if they aren’t null (you can define a custom truthy logic for your classes by implementing the boolean asBoolean() method)

For detailed examples on the truthy conversion you can check the official [documentation](http://www.groovy-lang.org/semantics.html#Groovy-Truth).

## Safe Navigation Operator

If the contact or the address are null, the result of the left side will just be null, but no exception will be thrown.

    if(company.getContact()?.getAddress()?.getCountry() == Country.NEW_ZEALAND) { ... }
    
## Elvis Operator

Groovy will assign client.getName() if it isn’t false (in case of a string that means not null and not empty) or the empty string otherwise.

    def name = client.getName() ?: ""

---
Taken from [here](https://www.timroes.de/2015/06/27/groovy-tutorial-for-java-developers/)