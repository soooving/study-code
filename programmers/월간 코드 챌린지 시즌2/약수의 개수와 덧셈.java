class Solution {
    public boolean measurePM(int val){
        int msNum = 0;
        for(int i=1; i<=val; i++){
            if(val%i==0)    msNum++;
        }

        return msNum%2==0 ? true : false;
    }

    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            if(measurePM(i))  
                answer += i;
            else 
                answer -= i;
        }

        return answer;
    }
}
