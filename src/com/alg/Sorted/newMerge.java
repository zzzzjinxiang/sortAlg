package com.alg.Sorted;

public class newMerge {

    public void mergeSorted(int left,int right,int[] arr){
        if(left<right){
            int middle = (left+right)/2;
            mergeSorted(left,middle,arr);
            mergeSorted(middle+1,right,arr);
            merge(left,right,middle,arr);
        }
    }

    private void merge(int left,int right,int middle,int[] arr){
        if(left<right){
            int i=left,j=middle+1;
            int[] temp = new int[right-left+1];
            for (;i<=right;i++){
                temp[i-left]=arr[i];
            }
            i=left;
            for(int k=left;k<right;k++){
                if(i>middle){
                    arr[k] = temp[j-left];
                    j++;
                }
                else if(j>right){
                    arr[k]=temp[i-left];
                    i++;
                }
                else if(temp[i-left]<temp[i-right]) {
                    arr[k] = temp[i-left];
                    i++;
                }
                else{
                    arr[k] = temp[j-left];
                    j++;
                }
            }
        }
    }
}
