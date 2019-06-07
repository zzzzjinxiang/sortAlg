package com.alg.Sorted;

public class heapSort {
    public static void heapify(int[] arrays,int arrLength,int index)
    {
        //任意位置的上浮
        //重构堆
        if(index>=arrLength){
            return;
        }
        int parent = (arrLength-1)/2;
        int left = 2*index+1;
        int right = 2*index+2;
        int max = index;
        if(left < arrLength && arrays[left]>arrays[max]){
            max = left;
        }
        if(right < arrLength && arrays[right]>arrays[max]){
            max=right;
        }
        if(max != index) {
            swap(arrays,max,index);
            heapify(arrays,arrLength,max);
        }
    }

    public static void heapyDown(int[] arr,int index,int length){
        while(index<length && arr[index]>arr[(index-1)>>1]){
                swap(arr,index,(index-1)>>1);
                index = (index-1)/2;
        }

    }

    public static void main(String[] args){
        int[] a = {1,2,6,3,4,7,9};
        heapSortOut(a,a.length);
        for(int x:a){
            System.out.println(x);
        }
    }

    public static void buildHeapify(int[] tree,int length){
        //整体上浮建立堆
        int last_node = length-1;
        int parent = (last_node-1)/2;
        for(int i=parent;i>=0;i--){
            heapify(tree,length,i);
        }
    }

    public static void heapSortOut(int[] tree, int length){
        buildHeapify(tree,length);
        for(int i = length-1;i>=0;i--) {
            swap(tree, i, 0);
            heapify(tree,i,0);
        }
    }

    private static void swap(int[] tree,int max, int i){
        int temp = tree[i];
        tree[i] = tree[max];
        tree[max] = temp;
    }
}
