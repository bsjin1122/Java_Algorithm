package codingTest.Array;

import java.util.Scanner;

/*
230822 5. 소수 (에라토스테네스 체)
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

 */
public class Main_05 {
    public int solution(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for (int i = 2; i < n; i++) {
            if(ch[i]==0){
                answer++;
                for (int j = i; j < n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_05 T = new Main_05();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
