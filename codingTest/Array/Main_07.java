package codingTest.Array;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/* 230822 7. 점수계산 
연속으로 맞출 경우 점수가 하나씩 증가
* */
public class Main_07 {
    public int solution(int[] test, int n){
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (test[i] == 1){
                cnt += 1;
                answer += cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main_07 T = new Main_07();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] test = new int[n];
        for(int i = 0; i <n; i++){
            test[i] = kb.nextInt();
        }
        System.out.println(T.solution(test, n));
    }
}
