package com.alg.Sorted;

public class guiBinSorted {

    public void merge(int[] array,int L, int M, int R){
        int leftSize = M-L;
        int rightSize = R-M+1;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        int i,j,k;

        for(i =L;i<M;i++){
            left[i-L]=array[i];
        }
        for(i=M;i<=R;i++){
            right[i-M]=array[i];
        }
        i=0;
        j=0;
        k=L;
        while(i<leftSize && j<rightSize){
            if(left[i]<right[j]){
                array[k]=left[i];
                i++;
                k++;
            }else {
                array[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<leftSize){
            array[k]=left[i];
            i++;
            k++;
        }

        while (j<rightSize){
            array[k]=right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr,int L,int R){
        if(L==R) return;
        else {
            int M=(L+R)/2;
            mergeSort(arr,L,M);
            mergeSort(arr,M+1,R);
            merge(arr,L,M+1,R);
        }
    }
}
