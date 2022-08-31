import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        report = hashSet.toArray(new String[0]);
        
        // 신고 계산
        HashMap<String, ArrayList<String>> totUsrList = new HashMap<String, ArrayList<String>>();
        for(int i=0; i<id_list.length; i++){
            ArrayList<String> totUsr = new ArrayList<String>();
            for(String repId : report){
                String[] repIdArr = repId.split(" ");
                if(!repIdArr[1].equals(id_list[i]))     continue;
                
                totUsr.add(repIdArr[0]);
            }
            
            totUsrList.put(id_list[i], totUsr);
        }
        
        // 메일 발송 횟수 계산
        int[] answer = new int[id_list.length];
        for(String key : id_list){
            if(totUsrList.get(key).size() < k)     continue;
            
            for(String val : totUsrList.get(key)){
                int locIdx = Arrays.asList(id_list).indexOf(val);
                int prevNum = answer[locIdx];
                answer[locIdx] = prevNum+1;
            }
        }
        
        return answer;
    }
}
