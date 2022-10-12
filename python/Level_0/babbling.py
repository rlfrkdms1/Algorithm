def solution(babbling):
    answer = 0
    pronunciation = ["aya", "ye", "woo", "ma" ]
    
    for i in babbling:
        word_len = 0
        for j in pronunciation :
            find = findWords(i,j)
            if checkContinued(find,len(j)) == False :
                break
            word_len += len(j)*len(find) # word안에 babble이 들어있는 문자 길이 -> ayaayaa의 경우 6
        if word_len == len(i) : # word안에 babble이 들어있는 문자 길이를 다 합쳤을 때 원래 문자의 길이와 같다면, 이 문자는 babble로 이루어진 문자이므로 answer에 1더하기
            answer += 1
            
    return answer

def checkContinued(find, length) : # 연속된 발음인지 check 만약 find의 길이가 1이면 check 할 필요없음
    if len(find) == 1 : return True # find의 길이가 1이면 연속된 발음이 있을 수 없으므로 true 반환

    for i in range(len(find)-1) : # find를 돌아가며 연속된 발음이 있는지 확인
        if find[i+1]-find[i]==length :
            return False # 연속된 발음이라면 false
    return True # 없다면 true

def findWords(word, babble): #word안에 babble이 어느 위치에 있는지 list로 반환
    index = 0
    find = []
    while index>-1: # find는 word안에 babble이 없을 경우 -1을 리턴하므로 words안에 babble을 찾을 때까지
        index = word.find(babble, index)
        if index > -1: # words에서 babble을 찾은 경우
            find.append(index) 
            index += len(babble) # 검색 시작 위치를 찾은 단어 뒤로 설정
    return find

# def solution(babbling):
#     answer = 0
#     prono = ['aya','ye','woo','ma']
#     for i in babbling :
#         for j in prono :
#             if j+j in i :
#                 break
#             else :
#                 i = i.replace(j,"").strip()
#         if i :
#             continue
#         else :
#             answer += 1
#     return answer