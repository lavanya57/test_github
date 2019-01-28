import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int Count, Counter = 1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number upto which you want to print the natural numbers:");
    Count = s.nextInt();
    System.out.print("The natural numbers upto " + Count + " are ");
    while(Counter <= Count)
    {
      System.out.print(" " + Counter);
      Counter = Counter + 1;
    }
    System.out.print(".");
    
  }
  }