using System;

class MainClass {
  public static void Main (string[] args) {
    int  Counter = 1, Product = 1, Power = 1, Final = 1;
    Console.Write("Enter a number upto which you want to print the series:");
    int Number  = Convert.ToInt32(Console.ReadLine());
    Console.Write("The series of the numbers upto " + Number + " is");
    for(Final = 1; Final <= Number; Final++) {
      for(Counter = 1; Counter <= Power; Counter++) {
        Product = Product * Power;
        Final = Product;
      }
      if(Final <= Number) {
        Console.Write(" " + Final);
      }
      Counter = 1;
      Product = 1;
      Power = Power + 1;
      }
      Console.Write(".");
  }
}