package basic.MinAlgorithm;
// [?] :  주어진 데이터 중에서 가장 작은 [짝수] 값
/*
 * 최솟값 알고리즘(Min Algorithm): (주어진 범위 + 주어진 조건)의 자료들의 가장 작은 값
 */
public class MinAlgorithm {
    public static void main(String[] args) {
        //[1] Initialize
        int min = Integer.MAX_VALUE; // 정수 형식의 데이터중 가장 큰 값으로 초기화

        //[2] Input
        int[] numbers = {2, 5, 3, 7, 1};

        //[3] Process
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 ==0 && numbers[i]<min){
                min = numbers[i];
            }
        }
        //[4] Output
        System.out.println("짝수 최솟값: "+ min);

    }
}
