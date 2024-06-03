arr=[[0 for _ in range(100)] for _ in range(100)]

for _ in range(int(input())):
    x,y = list(map(int,input().split()))
    for i in range(x,x+10):
        for j in range(y,y+10):
            arr[j][i] = 1
print(sum(sum(row) for row in arr))