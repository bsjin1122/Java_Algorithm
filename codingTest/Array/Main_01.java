package codingTest.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
    01 큰 수 출력하기
    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 */
public class Main_01 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_01 T = new Main_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x: T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
