import rsa

public_key, private_key = rsa.newkeys(2048)

message = input("Enter the message: ")

ciphertext = rsa.encrypt(message.encode(), public_key)
print("Encrypted:", ciphertext)

plaintext = rsa.decrypt(ciphertext, private_key)
print("Decrypted:", plaintext.decode())
