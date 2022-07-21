x = 10
count=0

while True:
    if x == 1:
        break
    elif x % 3 == 0 :
        count+=1
        x=x/3
        print(x)
    elif x % 2 == 0 :
        count+=1
        x=x/2
        print(x)
    else :
        x-=1
        count+=1
        print(x)

print(count)