import Foundation
print("To find max of 10 number's:")
var Counter = 0
var Numbers = [Int]()
print("Enter the first number", terminator:":")
Numbers.append(Int(readLine()!)!)
for _ in 1...9
{
    print("Enter the next number", terminator:":")
    Numbers.append(Int(readLine()!)!)
}
print("The max of ", terminator : "")
var Count = 0 
for Count in 0...9
{
  print("\(Numbers[Count])", terminator : " ")
}
var C = 0
var Max = Numbers[0]
for C in 1...9
{
  if(Max < Numbers[C])
  {
    Max = Numbers[C]
  }
}
print("is \(Max).")