import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int  Counter = 1, Product = 1, Power = 1, Final = 1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number upto which you want to print the series:");
    int Number  = s.nextInt();
    System.out.print("The series of the numbers upto " + Number + " is");
   for(Final = 1; Final <= Number; Final++)
   {
     for(Counter = 1; Counter <= Power; Counter++)
      {
        Product = Product * Power;
        Final = Product;
      }
      if(Final <= Number)
      {
        System.out.print(" " + Final);
      }
      Counter = 1;
      Product = 1;
      Power = Power + 1;
      }
    System.out.print(".");
    }
}