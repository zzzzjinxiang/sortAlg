package com.alg.Sorted;

public class HillSortAlg {
    public static void sorted(int[] arrs){
        int h = 1;
        int len = arrs.length;
        while(h<=len/3){
            h = h*3+1;
        }
        while(h>0){
            for(int i = h;i<len;i++){
                if(arrs[i]<arrs[i-h]){
                    int tmp = arrs[i];
                    int j = i-h;
                    while(j>=0 && arrs[j]>tmp){
                        arrs[j+h] = arrs[j];
                        j-=h;
                    }
                    arrs[j+h]=tmp;
                }
            }
            h = (h-1)/3;
        }
    }
}
