import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int lottoLev(int nums){
        int resLev = 6;

        if(nums == 6)           resLev = 1;
        else if(nums == 5)      resLev = 2;
        else if(nums == 4)      resLev = 3;
        else if(nums == 3)      resLev = 4;
        else if(nums == 2)      resLev = 5;

        return resLev;
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int crtLotto = 0, zeroLotto = 0;

        for(int i=0; i<lottos.length; i++) {
            int ival = lottos[i];
            if(ival == 0) {
                zeroLotto += 1;
            }
            else {
                crtLotto = Arrays.stream(win_nums).anyMatch(x -> x == ival) ? crtLotto+1 : crtLotto;
            }
        }

        int[] answer = {lottoLev(crtLotto+zeroLotto), lottoLev(crtLotto)};
        return answer;
    }
}
