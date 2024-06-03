n, b = input().split()
b = int(b)
result = 0

for i, j in enumerate(n):
    try:
        if int(j):
            result += int(j) * b ** (len(n)-i-1)
    except:
        result += (ord(j)-55) * b ** (len(n)-i-1)
print(result)