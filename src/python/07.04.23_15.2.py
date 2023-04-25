big = 0
lastB = 0

small = 0
lastS = 0

while True:
    a = int(input("Input nums="))
    if a == 0:
        break

    if a > big:
        lastB = big
        big = a

    if big > a > lastB:
        lastB = a

    if a < small:
        lastS = small
        small = a

    if small < a < lastS:
        lastS = a

print("small=", small, "lastSmall=", lastS, "sumSmall=", small + lastS)
print("big=", big, "lastBig=", lastB, "sumBig=", big + lastB)
