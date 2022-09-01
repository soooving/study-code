import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> midList = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1) {
                midList.add(arr[i]);
                continue;
            }     
            else if(arr[i] == arr[i+1]) {
                continue;
            }
            else {
                midList.add(arr[i]);
            }
        }

        int[] answer = new int[midList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = midList.get(i);
        }

        return answer;
    }
}
