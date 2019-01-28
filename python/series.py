from __future__ import print_function

import sys, os, time
Number = int(input('Enter a number upto which you want to print the series:'))
Product = 1
Power = 1
print('The series of the numbers upto {0} is' .format(Number), end='')
for Final in range(1, Number):
  for Counter in range(1, (Power + 1)):
    Product = Product * Power
    Final = Product
  if Final <= Number:
    print('', Final, end = '')
  Counter = 1
  Product = 1
  Power = Power + 1
print(".")