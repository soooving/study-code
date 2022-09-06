class Solution {
    public String solution(String new_id) {
        String answer = new_id;

        // 1단계
        answer = answer.toLowerCase();

        // 2단계
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3단계
        answer = answer.replaceAll("[.]{2,}", ".");

        // 4단계
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5단계
        answer = answer.equals("") ? "a" : answer;

        // 6단계
        if(answer.length() > 15)
            answer = answer.substring(0, 15).replaceAll("[.]$", "");

        // 7단계
        while(answer.length() < 3)
            answer = answer + answer.substring(answer.length()-1, answer.length());

        return answer;
    }
}
