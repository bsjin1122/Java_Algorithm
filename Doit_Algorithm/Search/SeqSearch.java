package Doit_Algorithm.Search;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key){
        int i =0;
        while(true){
            if(i==n)
                return -1; // 검색 실패! (-1 반환)
            if(a[i]==key)
                return i; // 검색 성공!인덱스 반환
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i<num; i++){
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }
        System.out.print("검색할 값: "); // 키 값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);
        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
