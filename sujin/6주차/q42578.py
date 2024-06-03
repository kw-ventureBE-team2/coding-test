def solution(clothes):
    dict = {}
    answer = 1

    for c in clothes:
        if c[1] in dict:
            dict[c[1]] += 1
        else:
            dict[c[1]] = 2

    for value in dict.values():
        answer *= value

    return answer - 1