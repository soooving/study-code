import java.util.Arrays;

class Solution {
    public int solution(String s) {
        String[] numArr = {"zero", "one", "two", "three", "four"
                        , "five", "six", "seven", "eight", "nine"};
        String snum = "", fnum = "";

        char tmp = ' ';
        for(int i=0; i<s.length(); i++){
            tmp = s.charAt(i);

            System.out.println(tmp + ", " + snum + ", " + fnum);

            if(Character.isDigit(tmp)){
                snum += tmp;
            }
            else {
                fnum += tmp;

                if(Arrays.asList(numArr).indexOf(fnum) >= 0){
                    snum += Arrays.asList(numArr).indexOf(fnum)+"";
                    fnum = "";
                }
            }
        }

        int answer = Integer.parseInt(snum);
        return answer;
    }
}
