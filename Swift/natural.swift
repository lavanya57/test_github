print ("How many natural numbers do you want to print", terminator : "?")
var Number = Int(readLine(strippingNewline: true)!)!
var Counter = 1
print ("The first \(Number) natural numbers are", terminator : "")
while Counter <= Number {
  print (" \(Counter)", terminator : "")
  Counter = Counter + 1
}
print (".")