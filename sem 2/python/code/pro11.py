# 11.Write a program to create function which shall accept any number of arguments and display total of all the numbers given as argument. 

def sum_all_numbers(*args):
    total = sum(args)
    print(f"Arguments received: {args}")
    print(f"Total sum: {total}")

sum_all_numbers(10, 20, 30, 40)
sum_all_numbers(5, 2.5, 12.5)