#Write a program to find out message digest(Hash value) from md5 algorithm.

import hashlib
import sys

str = input("Enter the value: ")
str = bytes(str,'utf-8')
result = hashlib.md5(str);

print("The byte equivalent pf hash is : ")
print(result.digest())

print("\r")
print("The size of output: ",end="")
print(sys.getsizeof(result.digest()))
