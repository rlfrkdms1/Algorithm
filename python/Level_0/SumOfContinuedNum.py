# 문제의 조건에서 연속된 세 개의 '정수'라고 했으므로 음수도 고려해야한다. 
# 하지만 total 이 0이상 이므로 사용할 수 있는 음수의 수는 한정되어있다. 
# -98 ~ 100까지라면? num = 199, total = 2가 될 수 있다. 물론 극단적인 경우로 num이 100을 넘어 실제 테케에 적합하진 않다.
# 나는 단순히 모든 경우의 수를 구해서 answer를 구할 생각이었으나, 
# 짝수일 경우와 홀수일 경우를 나눠서 total을 반으로 나눠서 양쪽으로 num/2씩 가져오면 되는거였다.
def solution(num, total):
    answer = []
    sum = 0
    result = 0
    for i in range(-100,1000) :
        for j in range(num) :
            sum += i+j
            print(sum)
        if sum == total :
            result = i
            break
        else : sum = 0  
    for i in range(num) :
        answer.append(result + i)  

    return answer

print(solution(4, 2))