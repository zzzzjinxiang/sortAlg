package com.company;

public class quickSort {
    public void quickSorted(Integer[] arrays,int left, int right) {
        if(left<right){
            int temp,low,high;
            temp = arrays[left];
            low = left;
            high = right;
            while(low<high) {
                //
                while(high > low && arrays[high]>temp){
                    high --;
                }
                if(low<high){
                    arrays[low++] = arrays[high];
                }
                while(low<high && arrays[low]<temp){
                    low++;
                }
                if(low<high){
                    arrays[high--]=arrays[low];
                }
            }
            arrays[low]=temp;
            quickSorted(arrays,left,low-1);
            quickSorted(arrays,low+1,right);
        }
    }
}
