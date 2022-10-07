def solution(denum1, num1, denum2, num2):
    # 서로 더할 수 있는 분수로 만들기 - 각각의 분모를 상대 분자에 곱하고, 분모는 분모끼리 곱한 것으로 분수를 바꾼다
    
    ## 분자
    denum1 = denum1 * num2
    denum2 = denum2 * num1
    
    ## 분모
    num = num1 * num2
    
    ## 분수 덧셈
    denum = denum1 + denum2
    
    ## 기약 분수 만들기
    ## 2부터 나누면 안된다. (1,4,3,4)일 경우를 생각해 보면 됨
    for i in range((num1 * num2), 1, -1) :
        if (num % i == 0) and (denum % i == 0) :
            num = int(num / i)
            denum = int(denum / i)
    
    answer = [denum, num]
    return answer

print(solution(1,4,3,4))