package codingTest.String;

import java.util.Scanner;

/*
    10 가장 짧은 문자거리
    한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
    teachermode e
    1 0 1 2 1 0 1 2 2 1 0
 */
public class Main_10 {
    public int[] solution(String s, char t){
        int[] answer=new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i)==t){
                p=0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_10 T = new Main_10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x: T.solution(str, c)){
            System.out.print(x + " ");
        }
    }
}
