print("Enter a number upto which you want to print the natural numbers:");
var Count = parseInt(readln());
print("The natural numbers upto ");
var NaturalNumbers = Count;
print(" are ");
var Counter = 1;
while(Counter <= Count)
{
  NaturalNumbers = NaturalNumbers + " " + Counter;
  Counter = Counter + 1;
}
print (NaturalNumbers + ".");