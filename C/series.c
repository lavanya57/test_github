#include <stdio.h>

int main(void) {
  int Number, Counter = 1, Product = 1, Power = 1, Final = 1; 
  printf("Enter a number upto which you want to print the series:");
  scanf("%d", &Number);
  printf("The series of the numbers upto %d is", Number);
  for(Final = 1; Final <= Number; Final++) {
    for(Counter = 1; Counter <= Power; Counter++) {
     Product = Product * Power;
     Final = Product;
    }
    if(Final <= Number) {
     printf(" %d", Final);
    }
    Counter = 1;
    Product = 1;
    Power = Power + 1;
  }
  printf(".");
  return 0;
}