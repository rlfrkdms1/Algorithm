from array import array
import string


array = [7, 77, 17]
index = 0 
answer = 0

## array에 있는 int를 모두 string형으로 변경
array = list(map(str, array))

## 각각의 원소의 7개수 구하기
for i in range(len(array)):
    '''
    index는 7을 찾은 위치를 반환
    만약 find를 이용해 7을 찾았는데 7이 없다면 -1을 반환함
    따라서 index가 -1이 될 때까지 7을 찾으면 됨
    이때 find는 찾는 시작 위치를 정할 수 있는데, 이 시작위치를 index에서 7의 길이만큼 더해준 것으로 지정해야한다. 
    이렇게 해주지 않으면 계속 -1을 반환하게 된다. 
    '''
    while index > -1:
        index = array[i].find('7',index)
        if index > -1 : 
            answer += 1     
            index += 1
    index=0
print(answer)
