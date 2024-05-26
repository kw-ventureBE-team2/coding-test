import sys

grade = ['A+','A0','B+','B0','C+','C0','D+','D0','F']
score = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0]

total = 0
total_score = 0
for i in range(20):
    A= list(sys.stdin.readline().split())
    if A[2]!='P':
        total_score+= score[grade.index(A[2])] * float(A[1])
        total += float(A[1])
print(total_score/total)