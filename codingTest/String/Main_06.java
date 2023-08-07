package codingTest.String;

import java.util.*;

/*
    6. 중복 문자 제거
    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

 */
public class Main_06 {
    public String solution(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " "+ str.indexOf(str.charAt(i)));
            // charAt: 문자열(String)에서 특정 인덱스에 위치한 문자를 반환하는 메서드
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_06 T = new Main_06();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
