def solution(genres, plays):
    answer = []
    dic = {}
    for i in range(len(genres)):
        if genres[i] in dic:
            # 현재 장르 이미 존재
            # 해당 장르 0번째 index에 현재 index를 append & 재생횟수 추가
            dic[genres[i]][0].append(i)
            dic[genres[i]][1] += plays[i]
        else:
            # dic에 현재 장르 없음
            # 현재 index와 재생횟수 추가
            dic[genres[i]] = [[i], plays[i]]
    
    # dic.items()를 재생횟수순으로 내림차순 정렬
    diclist = sorted(dic.items(), key = lambda x: -x[1][1])
    for i in diclist:
        # 현재 장르 곡=1
        # answer에 하나만 추가
        if len(dic[i[0]][0]) == 1:
            answer.append(dic[i[0]][0][0])
        else:
            # 현재 장르 곡 >= 2
            # 재생횟수순으로 내림차순 정렬, 상위 2개 곡만 추가
            dic[i[0]][0].sort(key = lambda x: -plays[x])
            answer.extend(dic[i[0]][0][:2])
    return answer