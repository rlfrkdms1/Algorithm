n=int(input())
move=list(input().split())
result=[1,1]

for i in move:
    if i == 'R':
        if result[1]+1>n:
            continue
        else : result[1]+=1
    elif i == 'L':
        if result[1]-1<1:
            continue
        else : result[1]-=1
    elif i == 'D':
        if result[0]+1>n:
            continue
        else : result[0]+=1
    elif i == 'U':
        if result[0]-1<1:
            continue
        else : result[0]-=1

print(result[0],result[1])
