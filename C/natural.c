#include<stdio.h>
int main(void) {
  int Number, Counter = 0;
  printf("How many natural numbers do you want to print?");
  scanf("%d", &Number);
  printf("The first %d natural numbers are", Number);
  for(Counter = 1; Counter <= Number; Counter++) {
    printf(" %d", Counter);
  }
  printf(".");
  return 0;
}