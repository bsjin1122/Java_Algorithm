package codingTest.String;

import java.util.Scanner;

/*
<설명>
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

<출력>
첫 줄에 가장 긴 단어를 출력한다.
가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.

 */
public class Main_03 {
    // indexOf, subString
    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        Main_03 T = new Main_03();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
//    public String solution(String str){
//        String answer = "";
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for(String x: s){
//            int len = x.length();
//            if(len > m){
//                m = len;
//                answer = x;
//            }
//        }
//
//        return answer;
//    }
}
