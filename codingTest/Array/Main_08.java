package codingTest.Array;

import java.util.Arrays;
import java.util.Scanner;

/* 230822 8. 등수구하기
5
87 89 92 100 76

4 3 2 1 5
 */
public class Main_08 {
    public int[] solution(int n, int[] score){
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = 1;
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;  // 1등으로 초기화, 순위 배열을 매 회전마다 1등으로 초기화
            for (int j = 0; j < score.length; j++) {
                if(score[i]< score[j]){ //현재(i)와 나머지들(j)비교
                    answer[i]++; //Rank: 나보다 큰 점수가 나오면 순위 1 증가
                }
            }
        }
        return answer;
    }
    /* 다른 풀이
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n j++){
                if(arr[j] > arr[i]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

     */
    public static void main(String[] args) {
        Main_08 T = new Main_08();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, score));

    }
    /*
     //[1] Input
        int[] scores = {90, 87, 100, 95, 80}; //등수 : 3, 4, 1, 2, 5
        int[] rankings = {1, 1, 1, 1, 1}; //모두 1로 초기화


        //[2] Process
       for (int i = 0; i < rankings.length; i++) {
            rankings[i] = 1; // 1등으로 초기화, 순위 배열을 매 회전마다 1등으로 초기화
            for (int j = 0; j < scores.length; j++) {
                if(scores[i]< scores[j]){ //현재(i)와 나머지들(j)비교
                    rankings[i]++; //Rank: 나보다 큰 점수가 나오면 순위 1 증가
                }
            }
       }

        //[3] Output
        for (int i = 0; i < rankings.length; i++) {
            System.out.println(String.format("%3d점: %1d등", scores[i], rankings[i]));
            // System.out.println(scores[i]+"점: "+ rankings[i] + "등");
        }
     */
}
