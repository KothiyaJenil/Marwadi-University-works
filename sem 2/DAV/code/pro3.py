def getMark(sub1, sub2, sub3):
    total = sub1 + sub2 + sub3
    isPassFail = ""
    if(sub1 < 35 or sub2 < 35 or sub3 < 35):
        isPassFail = "Fail"
    else:
        isPassFail = "Pass"
    return total

def result(total):
    per = total / 3
