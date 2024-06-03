def solution(phone_book):
    answer = True
    dic ={}
    for pNum in phone_book:
        dic[pNum] = 1
    for pNum in phone_book:
        temp=""
        for num in pNum:
            temp +=num
            if temp in dic and temp!=pNum:
                answer = False
    return answer