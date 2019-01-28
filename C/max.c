#include <stdio.h>

int main(void) {
  int Max, Numbers[10], Counter = 0;
  printf("To find max of 10 numbers, enter the first number:");
  scanf("%d", &Numbers[Counter]);
  for(Counter = 1; Counter < 10; Counter++) {
    printf("Enter the next number:");
    scanf("%d", &Numbers[Counter]);
  }
  printf("The maximum number among");
  Counter = 0;
  while(Counter < 10) {
    printf(" %d", Numbers[Counter]);
    Counter++;
  }
  printf(" is ");
  Max = Numbers[0]; 
  for(Counter = 0; Counter < 10; Counter++) {
    if(Max < Numbers[Counter]) {
       Max = Numbers[Counter];
    } 
  }
  printf("%d.", Max);
  return 0;
}