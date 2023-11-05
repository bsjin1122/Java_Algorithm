package Doit_Algorithm.Search;

import java.util.Scanner;

public class BinSearch {
    /* 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색*/
    static int binSearch(int[] a, int n, int key){
        int pl = 0; // O(1)
        int pr = n-1; // O(1)
        do{
            int pc = (pl+pr)/2; // O(log n)
            if(a[pc]== key) //O(log n)
                return pc; // O(1)
            else if(a[pc] < key) // O(log n)
                pl = pc + 1; // 검색 결과를 뒤쪽 절반으로 좁혀줌 // O(log n)
            else
                pr = pc + 1; // O(log n)
        }while(pl <= pr);// O(log n)
        return -1; // 검색 실패 O(1)
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];
        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();

        for(int i = 1; i <num; i++){
            do{
                System.out.print("x[" + i+ "]: ");
                x[i] = stdIn.nextInt();
            }while(x[i]< x[i-1]); // 바로 앞의 요소보다 작으면 다시 입력
        }
        System.out.print("검색할 값:");
        int ky = stdIn.nextInt();
        int idx = binSearch(x, num, ky);
        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
