package Doit_Algorithm.Search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorExample {
    public static void main(String[] args) {
        //정렬되지 않은 문자열 배열
        String[] unsortedArray = {"apple", "banana", "date", "grape", "cherry", "pink", "star", "fig"};

        // 원하는 항목
        Scanner scan = new Scanner(System.in);
        System.out.print("찾고자 하는 값을 입력하세요");
        String target = scan.next();

        //Comparator 를 사용하여 비교 로직 정의
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);  // 문자열을 오름차순으로 비교

            }
        };

        // 배열을 정렬
        Arrays.sort(unsortedArray, comparator);

        // 이진 검색 수행
        int index = Arrays.binarySearch(unsortedArray, target, comparator);
        // 이진 검색으로 배열을 반으로 나누어 찾는 값을 찾을 때까지 반복(결과에 따라 출력: 양수면-> 원하는 항목 찾음)
        // 그 위치를 출력한다. 결과가 음수면 항목을 찾지 못한 것이다.
        if(index >= 0){
            System.out.println("원하는 항목 '"+ target + "'을 찾았습니다. 인덱스: " + index);
        }else{
            System.out.println("원하는 항목 '" + target + "'을 찾지 못했습니다.");
        }
    }
}
