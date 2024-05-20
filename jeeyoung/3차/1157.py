word = input().upper()
word_list = list(set(word))
list = []

for i in word_list:
    count = word.count(i)
    list.append(count)

if list.count(max(list))>= 2:
    print("?")
else:
    print(word_list[list.index(max(list))])