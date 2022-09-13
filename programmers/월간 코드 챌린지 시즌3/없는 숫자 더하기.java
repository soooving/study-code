import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer=0;
        for(int i=0; i<10; i++){
            int key = i;
            if(!Arrays.stream(numbers).anyMatch(j -> j==key))
                answer += i;
        }

        return answer;
    }
}
