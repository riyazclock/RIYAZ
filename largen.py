a=input()
b=a.split()
num=int(b[0])
num1=int(b[1])
num2=int(b[2])
if (num>num1) and (num>num2):
   largest=num
elif(num1>num) and (num1>num2):
   largest=num1
else:
   largest=num2
print(largest)
