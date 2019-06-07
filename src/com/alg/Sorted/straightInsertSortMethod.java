package com.alg.Sorted;

public class straightInsertSortMethod {
    //选取一个有序表，一个无序表
    public void sorted(int[] arr){
        int len = arr.length;
        int i,j,key;
        for(i=1; i<len;i++){
            key=arr[i];
            j=i-1;
            while(arr[j]>key && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
