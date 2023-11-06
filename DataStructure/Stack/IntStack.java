package DataStructure.Stack;
// int형 스택

public class IntStack {
    private int max; // 스택 용량: 스택에 쌓을 수 있는 최대 데이터 수 , stk의 요솟수와 같다.
    private int ptr; // 스택 포인터-> 스택에 쌓여있는 데이터 수, 스택의 인덱스를 가리킨다.
    private int[] stk; // 스택 본체 / 배열 본체가 아니라 본체를 참조하는 배열 변수이다. 배열 본체는 생성자에서 생성한다.

    // 실행시 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    // 실행 시 예외: 스택이 가득참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    // 생성자
    public IntStack(int capacity){
        ptr = 0; // 생성 시 스택 비어있음
        max = capacity;
        try{
            stk = new int[max]; // 스택 본체용 배열을 생성
        }catch(OutOfMemoryError e){ // 생성할 수 없을 경우 error 발생 시
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException{
        if(ptr >= max)
            throw new OverflowIntStackException(); // 스택이 가득 차서 푸시할 수 없는 경우
        return stk[ptr++] = x; //x를 저장한 후의 stk[ptr]의 값이다. 푸시한 값을 나타낸다.
        // 전달받은 데이터 x를 배열 요소 stk[ptr]에 저장하고, 스택 포인터를 증가(increment) 시킨다.
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException{
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 스택이 비어있는 경우 예외 처리
    public int peek() throws EmptyIntStackException{
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr-1]; // 스택이 비어있지 않으면 꼭대기의 요소 반환
    }

    // indexOf 배열 인덱스가 큰 쪽에서 작은 쪽으로 스캔
    // 선형검색 : 꼭대기 -> 바닥
    public int indexOf(int x){
        for(int i = ptr-1; i >=0; i--) // top쪽에서 선형 검색
            if(stk[i] == x)
                return i; // 검색 성공
        return -1; // 검색 실패
    }

    // 스택을 비움
    public void clear(){ptr = 0;}

    // 스택의 용량 반환
    public int capacity(){return max;}

    // 스택에 쌓여있는 데이터 수 반환
    public int size(){return ptr;}

    // 스택이 비어있는가?
    public boolean isEmpty(){
        return ptr <= 0;
    }

    //스택 안의 모든 데이터를 바닥-> 꼭대기 순으로 출력
    public void dump(){
        if(ptr <= 0)
            System.out.println("스택이 비어있습니다");
        else{
            for(int i=0; i< ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }



}
