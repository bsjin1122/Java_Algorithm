package codingTest.Array;

import java.util.Scanner;

/* 230817 4. 피보나치 수열 */
public class Main_04 {
    // 배열, return 사용하지 않는 방법
    public void solution(int n){
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a + " " + b + " ");
        for (int i = 2; i< n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    /*
    배열 사용
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
 */

    public static void main(String[] args) {
        Main_04 T = new Main_04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
//        for(int x : T.solution(n)){
//            System.out.print(x + " ");
//        }
    }
}
