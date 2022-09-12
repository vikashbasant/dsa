package com.dsapractices.dsa.service;

import java.util.logging.Logger;

import static java.lang.String.*;

public class ContainerWithMostWater {

    private static final Logger LOGGER = Logger.getLogger(ContainerWithMostWater.class.getName());

    // TimeComplexity: O(n)
    // SpaceComplexity: O(1)
    public static int maxAreaBetter(int[] height){
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int lh = height[i];
            int rh = height[j];
            int minHeight = Math.min(lh, rh);
            int containMaxWater = minHeight * (j-i);
            max = Math.max(max, containMaxWater);
            if(lh < rh){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWaterContains = maxAreaBetter(height);
        LOGGER.info(format("Maximum water contain by container - %d", maxWaterContains));
    }

}
