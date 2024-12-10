public class trappedRainwater {

    public static int rainwater(int height[]){
        int n = height.length;

        //calculate left maximum height 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right maximum height
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater = 0;
        
        //Loop for traverse the array of height

        for(int i =0;i<n;i++){

            //waterLevel = min(leftMax , rightMax)

            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = waterlevel - height of bar height[i] and add that water in trappedwater

            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }
     public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainwater(height));
    }
}
