package codingTest.String;

import java.util.Scanner;

/*
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 ASCII code : 소문자 97 ~ 122, 대문자 65 ~ 90
 */
public class Main_02 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(x >= 97 && x <= 122) { // 소문자
                answer += (char)(x-32);
            }else {
                answer += (char)(x+32);
            }
//            if(Character.isLowerCase(x)){
//                answer += Character.toUpperCase(x);
//            }else{
//                answer += Character.toLowerCase(x);
//            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main_02 T = new Main_02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
