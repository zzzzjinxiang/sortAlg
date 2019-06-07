package com.alg.Sorted;

public class QuickSortAlg {
    public static void quickSort(int[] arrs,int begin,int end){
        if(begin>=end)
            return;
        int key = arrs[begin];
        int left = begin;
        int right = end;
        while(left<right){
            while(left<right && arrs[right]>key){
                right--;
            }
            if(left<right){
                arrs[left] = arrs[right];
                left++;
            }
            while(left<right && arrs[left]<key){
                left++;
            }
            if(left<right){
                arrs[right] = arrs[left];
                right--;
            }
        }
        arrs[left] = key;
        quickSort(arrs,begin,left-1);;
        quickSort(arrs,left+1,end);
    }

    public static void main(String[] args){
        int[] a = {6,2,5,8,1,4,32,9,7,3,11};
        quickSort(a,0,a.length-1);
        for(int x:a){
            System.out.println(x);
        }

    }
}
