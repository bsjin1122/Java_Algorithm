package codingTest.Array;

import java.util.Scanner;

/*
    09. 격자판 최대합 n*n개에서 행, 열, 대각선의 합 중 최대
 */
public class Main_09 {
    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1; // 행의 합
        int sum2; // 열의 합
        for(int i = 0; i< n; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);


        return answer;
    }
    public static void main(String[] args) {
        Main_09 T = new Main_09();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));

    }
}
