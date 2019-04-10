package com.company;

public class heapSort {
    public void heapify(Integer[] arrays,int n,int i)
    {
        //任意位置的上浮
        //重构堆
        if(i>=n){
            return;
        }
        int parent = (n-1)/2;
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;
        if(left < n && arrays[left]>arrays[max]){
            max = left;
        }
        if(right < n && arrays[right]>arrays[max]){
            max=right;
        }
        if(max != i) {
            swap(arrays,max,i);
            heapify(arrays,n,max);
        }
    }

    public void buildHeapify(Integer[] tree,int length){
        //整体上浮建立堆
        int last_node = length-1;
        int parent = (last_node-1)/2;
        for(int i=parent;i>=0;i--){
            heapify(tree,length,i);
        }
    }

    public void heapSortOut(Integer[] tree, int length){
        buildHeapify(tree,length);
        for(int i = length-1;i>=0;i--) {
            swap(tree, i, 0);
            heapify(tree,i-1,0);
        }
    }

    private static void swap(Integer[] tree,int max, int i){
        int temp = tree[i];
        tree[i] = tree[max];
        tree[max] = temp;
    }
}
