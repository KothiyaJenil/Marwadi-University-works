#Write a program to find out message digest(Hash value) from SHA-1 algorithm.

import hashlib

text = input("Enter a string to generate hash: ")

sha1_result = hashlib.sha1(text.encode())
print("\n--- SHA-1 Hash ---")
print("SHA-1 (hex):", sha1_result.hexdigest())
print("SHA-1 Output Size (in bites):", len(sha1_result.digest()) * 8)
