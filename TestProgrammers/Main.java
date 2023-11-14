package TestProgrammers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};//{95, 90, 99, 99, 80, 99};//
        int[] speeds = {1, 30, 5};//{1, 1, 1, 1, 1, 1};//
        ArrayList<Integer> arr = countDays(progresses, speeds);
        ArrayList<Integer> funcArray = funcCount(arr);
        int[] answer = funcArray.stream().mapToInt(Integer::intValue).toArray();
        //System.out.println(Arrays.toString(answer));
    }
    public static ArrayList<Integer> countDays(int[] p, int[] s){
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < p.length; i++){
            int minus = 100 - p[i];
            if(minus % s[i] == 0){
                arrList.add(minus / s[i]);
            }else{
                arrList.add((minus / s[i]) + 1);
            }
        }
        return arrList;
    }
    public static ArrayList<Integer> funcCount(ArrayList<Integer> arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        // [5, 10, 1, 1, 20, 1]
        for(int i = 0; i < arr.size(); i++){
             if(stack.isEmpty()){ // 스택이 비어있을 때
                stack.push(arr.get(i));
                continue;
            }
            if(!stack.isEmpty()){
                if(arr.get(i) >= stack.elementAt(0)){
                    while(stack.size() > 0){
                        stack.pop();
                        count++;
                    }
                    arrayList.add(count);
                    count=0;
                    stack.push(arr.get(i));
                    if(i == arr.size()-1){
                        arrayList.add(stack.size());
                        break;
                    }
                }else if(arr.get(i) < stack.elementAt(0)){
                    stack.push(arr.get(i));
                    if(i == arr.size()-1){
                        arrayList.add(stack.size());
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
