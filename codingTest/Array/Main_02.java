package codingTest.Array;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/*
2. 보이는 학생

8
130 135 148 140 145 150 150 153

출력 5
 */
public class Main_02 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > max){
                answer += 1;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_02 T = new Main_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
