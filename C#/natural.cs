using System;

class MainClass {
  public static void Main (string[] args) 
  {
    int Count, Counter = 1;
    Console.Write("Enter a number upto which you want to print the natural numbers:");
    Count = Convert.ToInt32(Console.ReadLine());
    Console.Write("The natural numbers upto " + Count + " are");
    while(Counter <= Count) {
      Console.Write(" " + Counter);
      Counter = Counter + 1;
    }
    Console.Write(".");
  }
}