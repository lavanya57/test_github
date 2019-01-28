import Swift
print("Enter a number upto which you want to print the series", terminator:":")
var Number = Int(readLine()!)!
var Product:Int = 1
var Power:Int = 1
var Counter:Int = 1
var Final:Int = 1
print("The series of the numbers upto \(Number) is", terminator:"" )
while Final <= Number
{
  while(Counter <= Power)
  {
    Product = Product * Power
     Final = Product
     Counter = Counter + 1 
  }
  if Final <= Number
  {
    print(" \(Final)", terminator:"")
  }
  Counter = 1
  Product = 1
  Power = Power + 1
  
}
print(".")