from unittest import result


N, M, K= map(int, input().split())
num_list =list(map(int, input().split()))
answer = 0

num_list.sort()

first = num_list[N-1]
second = num_list[N-2]

for i in range(1,M+1):
    if i%K ==1 :
        if(i==1):
            answer += first
        else:
            answer += second
    else : 
        answer += first

print(answer)


n, m, k= map(int, input().split())
data =list(map(int, input().split()))

data.sort()
first = num_list[n-1]
second = num_list[n-2]

count = int(m / (k + 1)) * K
count += m % (k + 1)

result = 0
result += (count) * first
result += (m-count) * second

print(result)


print(answer)

