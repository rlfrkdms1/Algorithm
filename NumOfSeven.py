from array import array
import string


array = [7, 77, 17]
index = 0 
answer = 0
array = list(map(str, array))
for i in range(len(array)):
    print(i)
    while index > -1:
        index = array[i].find('7',index)
        print(index)
        if index > -1 : 
            answer += 1     
            index += 1
    index=0
print(answer)