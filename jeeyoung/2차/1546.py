subject = int(input())
score = list(map(int, input().split()))
max_score = max(score)
for i in range(subject):
    score[i] = score[i]/max_score*100
print(sum(score)/subject)