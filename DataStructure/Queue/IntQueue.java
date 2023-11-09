package DataStructure.Queue;

import DataStructure.Stack.IntStack;

// int형 큐
public class IntQueue {
    private int max; // 큐의 용량 que에 저장할 수 있는 최대 요소의 개수와 같다.
    private int front; // 첫 번째 요소 커서
    private int rear; // 마지막 요소 커서: 인큐한 데이터 중 맨 나중에 넣은 요소의 하나 뒤 인덱스 저장
    private int num; // 현재 데이터 수
    private int[] que; // 큐 본체: 인큐하는 데이터를 저장하기 위한 큐 본체용 배열

    // 실행 시 예외 : 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }

    // 실행 시 예외: 큐가 가득참
    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException(){}
    }

    // 생성자
    public IntQueue(int capacity){
        num = front = rear = 0; // 생성 시 큐는 비어있으므로 0으로
        max = capacity;
        try{
            que = new int[max]; // 큐 본체용 배열을 생성
        }catch(OutOfMemoryError e){ // 생성할 수 없을 경우 error 발생 시
            max = 0;
        }
    }

    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException{
        if(num >= max)
            throw new OverflowIntQueueException(); // 큐가 가득 참
        que[rear++] = x;
        num++;
        if(rear == max)
            rear = 0;
        return x; // 인큐한 값 그대로 반환
    }

    // 큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }

    // 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    // front, rear, num의 값이 변화하지는 않는다.
    public int peek() throws IntQueue.EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException(); // 비어있으면 예외 던짐
        return que[front];
    }

    // 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x)
                return idx;
        }
        return -1; // 검색 실패
    }

    // 큐를 비움
    public void clear(){ num = front = rear = 0;}

    // 큐의 용량을 반환
    public int capacity(){return max;}

    public int size(){return num;}

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= max;
    }

    // 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump(){
        if(num <= 0)
            System.out.println("큐가 비어있습니다");
        else{
            for(int i=0; i< num; i++)
                System.out.print(que[(i + front) % max] + " ");
            System.out.println();
        }
    }


}
