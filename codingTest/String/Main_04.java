package codingTest.String;

import java.util.ArrayList;
import java.util.Scanner;

/*
   4. 단어 뒤집기
   N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

   첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
   두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

 */
public class Main_04 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        // 직접 문자 뒤집기
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);

        }

//        for(String x: str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        return answer;
    }
    public static void main(String[] args) {
        Main_04 T = new Main_04();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for(String x: T.solution(n, str)){
            System.out.println(x);
        }
    }
}
