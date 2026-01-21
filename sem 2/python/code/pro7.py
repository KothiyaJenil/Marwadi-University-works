lst = []

while True:
    print("\n1.Add  2.Delete  3.Show  4.Exit")
    ch = int(input("Choice: "))

    if ch == 1:
        lst.append(int(input("Enter element: ")))

    elif ch == 2:
        x = int(input("Enter element: "))
        if x in lst:
            lst.remove(x)

    elif ch == 3:
        print(lst)

    elif ch == 4:
        break

    else:
        print("Invalid choice")
