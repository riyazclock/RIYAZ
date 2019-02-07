r=['a','e','i','o','u','A','E','I','O','U']
d=['!','@','#','$','%','^','&']
ch=str(input("enter the character"))
if(ch in r):
  print("vowels")
elif(ch in d):
  print("invalid")  
else:
  print("consonent")
 
