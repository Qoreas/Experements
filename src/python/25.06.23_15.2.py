medianSum = 0
count = 0
isContains = -1

while True:
    a = int(input("Input number: "))
    if a == 0:
        break
    if 99 < a < 1000:
        medianSum += a
        count += 1
        isContains = 0

if isContains != 0:
    print("NO")
else:
    print(medianSum / count)