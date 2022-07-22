from unittest import result


n, k=map(int, input().split())

count=0
while True:
    if n % k == 0 :
        count+=n//k
        break
    elif n == 1:
        break
    else :
        n -= 1
        count += 1

print(count)
