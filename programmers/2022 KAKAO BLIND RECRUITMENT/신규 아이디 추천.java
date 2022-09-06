class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        
        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        answer = answer.equals("") ? "a" : answer;
        
        if(answer.length() > 15)
            answer = answer.substring(0, 15).replaceAll("[.]$", "");
        
        while(answer.length() < 3)
            answer = answer + answer.substring(answer.length()-1, answer.length());

        return answer;
    }
}
