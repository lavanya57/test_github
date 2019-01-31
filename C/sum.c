#include<stdio.h>
void main()
{
	int Number1, Number2, Sum;
	printf("To find sum of two numbers, enter first number:");
	scanf("%d", &Number1);
        printf("Enter the second number:");
	scanf("%d", &Number2);
	Sum = Number1 + Number2;
	printf("The sum of %d and %d is %d.", Number1, Number2, Sum);
}
