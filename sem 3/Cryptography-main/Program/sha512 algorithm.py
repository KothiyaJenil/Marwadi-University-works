#Write a program to find out message digest(Hash value) from sha512 algorithm.

import hashlib

text = input("Enter a string to generate hash: ")

sha512_result = hashlib.sha512(text.encode())
print("\n--- SHA-512 Hash ---")
print("SHA-512 (hex):", sha512_result.hexdigest())
print("SHA-512 Output Size (in bites):", len(sha512_result.digest()) * 8)
