
print("To find max of 10 number's:")
Numbers = []
Counter = 0
print("Enter the first number:", end = '')
Numbers.append(int(input()))
while Counter < 9:
    print("Enter the next number:", end = '')
    Numbers.append(int(input()))
    Counter = Counter + 1
print("The max of", end = '')
Counter = 0;
while Counter < 10:
    print("", Numbers[Counter], end = '')
    Counter = Counter + 1
print(" is", end = '')
Max = Numbers[0]
for Counter in range(0,10):
    if Max < Numbers[Counter]:
       Max = Numbers[Counter]
print('', Max, end = '.')
 
  