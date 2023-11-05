package Doit_Algorithm.Search;

import java.util.Date;

public class Compare {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;
        System.out.println(a.compareTo(b)); // -1 : 현재 객체가 비교 대상 객체보다 작음

        String str1 = "candy";
        String str2 = "banana";
        System.out.println(str1.compareTo(str2)); // 1: 클 때 (사전적 순서로 비교)

        Date date1 = new Date(2023, 11, 15);
        Date date2 = new Date(2023, 11, 15);
        int result = date1.compareTo(date2);
        System.out.println(result); // 같을 때 0반환


    }
}
