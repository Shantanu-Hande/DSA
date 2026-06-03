import java.util.*;

public class TrappedWater{

    public static int trappedRainWater(int height[]){

        int n = height.length;

        //calculate max Left Boundary
        int maxLeftboundary[] = new int[n];
        maxLeftboundary[0] = height[0];
        for(int i=1 ; i<n ; i++){
            maxLeftboundary[i] = Math.max(height[i],maxLeftboundary[i-1]);
        }

        //calculate max Right Boundary
        int maxRightboundary[] = new int[n];
        maxRightboundary[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            maxRightboundary[i] = Math.max(height[i],maxRightboundary[i+1]);
        }


        int trappedWater = 0;
        //Loop for Trapped TrappedWater
        for(int i=0 ; i<n ; i++){

            //WaterLevel = min(maxLeftboundary,maxRightboundary)
            int waterlevel = Math.min(maxLeftboundary[i],maxRightboundary[i]);

            //TrappedWater = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(trappedRainWater(height));

    }
}