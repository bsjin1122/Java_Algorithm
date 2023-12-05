# 정렬
- 이름, 학번, 키 등 핵심 항목(key)의 대소 관계에 따라 데이터 집합을 일정한 순서로 줄지어 늘어서도록 바꾸는 작업

## 내부 정렬과 외부 정렬
1. `내부 정렬`: 정렬할 모든 데이터를 하나의 배열에 저장할 수 있는 경우 사용하는 알고리즘
2. 외부 정렬: 정렬할 데이터가 너무 많아 하나의 배열에 저장할 수 없는 경우 사용하는 알고리즘

> `교환`, `선택`, `삽입`
> - 3가지 핵심 요소

# 힙(heap)
- 힙: 부모의 값이 자식의 값보다 항상 크다 는 조건을 만족하는 완전이진트리
  - 이때, 부모의 값이 자식보다 항상 작아도 힙이라 한다. (부모와 자식 요소만 일정하면 OK)
  258