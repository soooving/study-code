class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        for(int[] size : sizes){
            int sizeW, sizeH;
            if(size[0] < size[1]) {
                sizeW = size[0];
                sizeH = size[1];
            }
            else {
                sizeW = size[1];
                sizeH = size[0];
            }
          
            if(maxW < sizeW)      maxW = sizeW;
            if(maxH < sizeH)      maxH = sizeH;
        }

        return maxW*maxH;
    }
}
