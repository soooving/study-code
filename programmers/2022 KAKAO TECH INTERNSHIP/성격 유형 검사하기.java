import java.util.Arrays;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] typeList = {"R", "T", "C", "F", "J", "M", "A", "N"};
        int[] cnList = new int[8];
        
        // 선택별 점수 계산
        for(int i=0; i<survey.length; i++){
            String[] svList = survey[i].split("");
            int locRes1 = Arrays.asList(typeList).indexOf(svList[0]);
            int locRes2 = Arrays.asList(typeList).indexOf(svList[1]);
            
            int choiceNum = choices[i];
            if(choiceNum == 1)       { cnList[locRes1] += 3; }
            else if(choiceNum == 2)  { cnList[locRes1] += 2; }
            else if(choiceNum == 3)  { cnList[locRes1] += 1; }
            else if(choiceNum == 5)  { cnList[locRes2] += 1; }
            else if(choiceNum == 6)  { cnList[locRes2] += 2; }
            else if(choiceNum == 7)  { cnList[locRes2] += 3; }
        }
        
        // 유형 계산
        String answer = "";
        for(int i=0; i<cnList.length; i++){
            if(i%2 !=0) continue;
            
            if(cnList[i] < cnList[i+1]){
                answer += typeList[i+1];
            }
            else {
                answer += typeList[i];
            }
        }
        
        return answer;
    }
}
