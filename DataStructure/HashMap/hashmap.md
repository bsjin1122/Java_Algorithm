[출처: HashMap 사용법](https://kadosholy.tistory.com/120)

# HashMap
- 키(Key)와 밸류(value) 가 짝을 이루어 저장 
- 저장 시 키(key) 값으로 해시 함수를 실행한 결과를 통해 저장위치를 결정
- `데이터의 추가, 삭제, 특히 검색이 빠르다는 장점`
> 키 값은 중복이 될 수 없고, 밸류는 키 값이 다르면 중복 가능하다. 

## 생성방법
```java
HashMap<String, String> h1 = new HashMap<String, String>(); // 기본 capacity 16, load factor:0.75
ex) HashMap<String, String> h3 = new HashMap<String, String>(20, 0.8);
```

- capacity: 데이터 저장 용량
- load factor : 데이터 저장공간을 추가로 확보해야 하는 시점 지정 
- ex) load factor 0.8은 저장 공간이 80% 채워져 있을 경우 추가로 저장공간을 확보한다.

## HashMap 메서드
### 1. 데이터 추가
1) V put(K key, V value)
2) void putAll(Map<? extends K, ? extends V> m): Map m의 데이터를 전부 저장 
3) V putIfAbsent(K key, V value): 기존 데이터에 key가 없으면 key와 value 저장 

### 2. 데이터 삭제 
1) void clear()
2) V remove(Object Key)
3) boolean remove(Object key, Object value): 동시에 일치하는 데이터 삭제 

### 3. 데이터 수정 
1) V replace(K key, V value): key와 일치하는 기존 데이터의 value 변경 
2) V replace(K key, V oldValue, V newValue): key와 oldValue가 동시에 일치하는 데이터의 value를 newValue로 변경

### 4. 데이터 확인
1) boolean containsKey(Object key)
2) boolean containsValue(Object value)
3) boolean isEmpty() : 빈 상태면 true
4) int size(): key-value 매핑 데이터의 개수 반환

### 5. 데이터 반환
1) V get(Object key)
2) V getOrDefault(Object key, V defaultValue)
3) Set<Map.Entry<K, V>> entrySet(): 모든 key-value 맵핑 데이터를 가진 Set 데이터를 반환
4) Set<K> keySet() : 모든 key 값을 가진 Set 데이터를 반환
5) Collection<V> values() : 모든 value값을 가진 Collection 데이터를 반환

---
# HashSet
- 중복된 요소를 허용하지 않는 집합(Set)을 구현한 클래스 
- 요소를 저장할 때 순서가 정해져있지 않다. 즉, 요소가 저장된 순서를 보장하지 않는다. 
- 내부적으로 HashTable을 사용하여 요소를 관리, 해시 함수를 사용하여 요소를 검색 및 삽입한다. 
- 주로 `중복된 요소를 제거, 순서가 중요하지 않은 경우에 사용`

# 해시
해시함수를 사용하여 데이터를 일정한 길이의 문자열로 변환하는 프로세스를 나타낸다.
이 문자열은 데이터의 고유한 표현을 생성하며, 해시 함수를 통해 데이터를 빠르게 검색할 수 있다.