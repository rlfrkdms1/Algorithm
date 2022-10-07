## 분수

- 기약 분수 만들기 (나눌 때 2부터 나누면 안되고 큰 수부터 내려가면서 나눠야 한다.)
[분수의 합](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/SumOfTwoOfFraction.py)

- 통분하기 
  - 분모끼리 곱해서 통분하기
  [분수의 합](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/SumOfTwoOfFraction.py)


## 수열

- 등차수열과 등비수열의 구분법 (숫자가 최소 3개는 제공되므로 연속되는 숫자의 차가 항상 같으면 등차수열, 같지 않으면 등비수열)
[다음에 올 숫자](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/NextNum.py)

- 등차수열의 공차 구하기 (차를 이용)
[다음에 올 숫자](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/NextNum.py)

- 등비수열의 등비 구하기 (나눗셈을 이용)
[다음에 올 숫자](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/NextNum.py)

## 변경

- 리스트
  - 리스트의 int를 모두 문자로 바꾸기 (map(str, 바꿀 array)) -> 만약 list로 반환한다면 list()를 씌워줘야 한다.
  [7의 개수](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/NumOfSeven.py)


## 검색

- find(찾을 문자, 시작점, 종료점)
  - find는 찾은 문자의 index를 반환하며 문자를 찾는 범위는 매개변수로 주어진 시작점과 종료점내이다. 하지만 이러한 시작점과 종료점이 주어지지 않는 경우엔, 문자의 시작과 끝이 각각 시작점과 종료점이 된다. 즉, 시작점 : 0, 종료점 : len(찾을 문자) - 1
  - find는 리스트, 튜플, 딕셔너리 자료형에서 사용불가하다. 
  [7의 개수](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/NumOfSeven.py)

## 정렬

- sorted : sorted의 매개변수에는 정렬할 data가 필수적으로 들어가야하는데, 이 data는 정렬할 수 있는, 즉 iterable한 데이터여야한다. 
  - sorted(data) 
  - sorted(data, reverse)
  - sorted(data, key)
  - sorted(data, key, revers)
  key : 정렬의 기준
  reverse : 디폴트 - reverse = False 로 오름차순이다. 따라서 내림차순으로 정렬하고 싶다면 reverse = True라고 지정해주면 된다. 
  [문자열 정렬 2](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/StringSort_2.py)

- sort와 sorted의 차이점 
  - sort는 기존의 리스트를 정렬하지만, sorted는 기존의 리스트는 건들지 않고, 정렬한 새로운 리스트를 만들어낸다. 
  예를 들어 a.sort()를 하면 a는 정렬되지만, sorted(a)를 하면 a는 정렬되지 않고, b=sorted(a) 를 했을 때 정렬된 a가 b에 담기는 것이다. 
  - sort는 문자열에 사용이 불가능하나, sorted는 문자열에 사용이 가능하다. 

## 병합

- join : 문자열 합치기를 지원한다. 
  - ''.join(list)
  list에 있는 문자열을 모두 합쳐준다. 
  [문자열 정렬 2](https://github.com/rlfrkdms1/Algorithm/blob/2b7a6f89cc20834cd4da3feb506e18e2c3a2a4e2/python/Level_0/StringSort_2.py)
  
  - '구분자'.join(list)
  list의 문자들이 합쳐질 때마다 구분자가 붙는다. 
  예를 들어 '-'.join(['a','b'])이면 결과는 a-b가 될 것이다. 
  

