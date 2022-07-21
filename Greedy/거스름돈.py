N = 1370
count = 0 # 동전의 개수

coin_types = [500, 100, 50, 10]

for coin in coin_types:
    count += N // coin
    N %= coin

print(count)
