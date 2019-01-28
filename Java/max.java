import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int Max = 0, Counter = 1;
    int[] Numbers = new int[11];
    Scanner s = new Scanner(System.in);
    System.out.print("To find max of 10 number's,enter the first number:");
    Numbers[0] = s.nextInt();
    while(Counter < 10)
    {
      System.out.print(" Enter the next number :");
      Numbers[Counter] = s.nextInt();
      Counter++;
    } 
  
    System.out.print("The max of");
   Counter = 0;
   while(Counter < 10)
   {
     System.out.print(" "+ Numbers[Counter]);
      Counter++;
   }
   System.out.print(" is ");
   Max = Numbers[Counter]; 
   for(Counter = 0; Counter < 10; Counter++)
   {
      if(Max < Numbers[Counter])
      {
        Max = Numbers[Counter];
      } 
   }
    System.out.print(Max +".");
      
  }
}