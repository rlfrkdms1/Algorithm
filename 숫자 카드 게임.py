N ,M = map(int, input().split())
num_array = [list(map(int, input().split())) for _ in range(N)]

min_arr = [min(num_array[i]) for i in range(N)]

answer = max(min_arr)
print(answer)
