a=input().split()
start=int(a[0])
end=int(a[1])
for num in range(start+1 , end + 1): 
  if num % 2 != 0: 
     print(num,end = " ") 
