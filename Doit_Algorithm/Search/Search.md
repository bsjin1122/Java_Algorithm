## 검색 

특정항목에 주목 -> 키(key) (ex: 국적, 나이 등)

1. 선형 검색: 무작위로 늘어놓은 데이터 모임에서 검색 
2. 이진 검색 : 일정한 규칙으로 늘어놓은 ~에서 아주 빠른 검색 
3. 해시법: 추가, 삭제가 자주 일어나는 ~
  - 체인법: 같은 해시 값의 데이터를 선형 리스트로 연결
  - 오픈 주소법: 데이터를 위한 해시값이 충돌할 때 재해시 하는 방법

## 선형검색(순차 검색)
### linear search / sequential search
직선 모양으로 늘어선 배열에서의 검색은 원하는 키 값을 갖는 요소를 만날 때까지 `맨 앞부터 순서대로` 요소를 검색

### 검색의 종료조건
(1): 검색할 값을 발견하지 못하고 배열의 끝까지 간 경우(실패)
(2): 검색할 값과 같은 요소를 발견한 경우(성공)
평균 n/2회

## 보초법
검색 비용을 반(50%)으로 줄이는 방법

---
## 03-3 이진 검색 
전제조건: 데이터가 키 값으로 이미 정렬(sort)되어 있다
- 선형 검색보다 좀 더 빠르게 검색할 수 있다는 장점 

### 이진검색
요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
- 이진검색을 하나씩 진행할 때마다 검색 범위가 (거의) 반으로 좁혀진다. 
- 다음에 검색할 범위의 중간지점으로 단숨에 이동

### 복잡도 
- 프로그램이 동작하는 하드웨어나 컴파일러 조건에 따라 실행속도는 달라진다. `복잡도`
> 1. 시간 복잡도: 실행에 필요한 시간을 평가한 것 
> 2. 공간 복잡도: 기억 영역과 파일 공간이 얼마나 필요한가를 평가한 것 