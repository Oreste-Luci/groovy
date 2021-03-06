/**
 * @author Oreste Luci
 */

def pattern = ~/a slash must be escaped \/ but backslash, like in a digit match \d does not/
println pattern.getClass()

def matcher = "The Hitchhiker's Guide to the Galaxy" =~ /Galaxy/
if (matcher) {
  println "Found the word 'Galaxy'"
}

def m = "Groovy is groovy" =~ /(G|g)roovy/
println m[0][0] // The first whole match (i.e. the first word Groovy)
println m[0][1] // The first group in the first match (i.e. G)
println m[1][0] // The second whole match (i.e. the word groovy)
println m[1][1] // The first group in the second match (i.e. g)


