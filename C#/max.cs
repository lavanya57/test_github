using System;

class MainClass {
  public static void Main (string[] args) {
    int Max = 0, Counter = 1;
    int[] Numbers = new int[11];
    Console.Write("To find maximum of 10 number's, enter the first number:");
    Numbers[0] = Convert.ToInt32(Console.ReadLine());
    while(Counter < 10) {
      Console.Write("Enter the next number : ");
      Numbers[Counter] = Convert.ToInt32(Console.ReadLine());
      Counter++;
    } 
    Console.Write("The maximum number among");
    Counter = 0;
    while(Counter < 10) {
     Console.Write(" "+ Numbers[Counter]);
      Counter++;
    }
    Console.Write(" is ");
    Max = Numbers[Counter]; 
    for(Counter = 0; Counter < 10; Counter++) {
      if(Max < Numbers[Counter]) {
        Max = Numbers[Counter];
      } 
    }
    Console.Write(Max +".");
  }
}