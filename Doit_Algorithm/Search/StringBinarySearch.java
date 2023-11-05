package Doit_Algorithm.Search;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[] x ={
            "apple", "banana", "grape", "cherry", "orange", "strawberry", "pineapple", "watermelon"
        };
        System.out.print("원하는 키워드를 입력하세요: ");
        String ky = stdIn.next();
        int idx = Arrays.binarySearch(x, ky);
        if(idx < 0)
            System.out.println("해당 키워드가 없습니다");
        else
            System.out.println("해당 키워드는 x["+ idx + "]에 있습니다.");
    }
}
