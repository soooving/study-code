import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    // 중복 제거
    public String[] resetList (String[] arr) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(arr));
        
        return hashSet.toArray(new String[0]);
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복 제거
        id_list = resetList(id_list);
        report = resetList(report);

        // 신고 계산
        HashMap<String, ArrayList<String>> totUsrList = new HashMap<String, ArrayList<String>>();
        for(String repId : report){
            ArrayList<String> val = new ArrayList<String>();
            String[] repIdArr = repId.split(" ");
            if(totUsrList.containsKey(repIdArr[1])) {
                val = totUsrList.get(repIdArr[1]);
            }
            
            val.add(repIdArr[0]);
            totUsrList.put(repIdArr[1], val);
        }

        // 메일 발송 횟수 계산
        int[] answer = new int[id_list.length];  
        for(String key : id_list){
            if(!totUsrList.containsKey(key))       continue;
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
