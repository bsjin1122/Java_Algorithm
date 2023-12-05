package TestProgrammers.Baekjoon.package1;

import java.io.*;

public class Boj_200_9093 { // 단어 뒤집기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            String str = br.readLine();
            String reversedString = reverseWords(str);
            bw.write(reversedString +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static String reverseWords(String str){
        String[] splitArray = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for(String word: splitArray){
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" "); // 뒤집은 단어를 결과 문자열에 추가
        }
        return reversedString.toString().trim(); // 문자열 앞뒤 공백 제거
    }

}
