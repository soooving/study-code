class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
      
        for(int i=1; i<=count; i++)
            answer +=  Long.valueOf(price * i);

        answer = answer>Long.valueOf(money) ? answer-Long.valueOf(money) : 0;

        return answer;
    }
}
