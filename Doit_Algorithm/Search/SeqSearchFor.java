package Doit_Algorithm.Search;

import java.util.Scanner;

// 선형검색 : 배열에서 순서대로 검색 (for문)
public class SeqSearchFor {
    static int seqSearch(int[] a, int n, int key){
        for (int i = 0; i < n; i++) {
            if(a[i]== key)
                return i;
        }
        return -1;
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
