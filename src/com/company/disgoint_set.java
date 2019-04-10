package com.company;

public class disgoint_set {
    public void initialize(int[] arr, int k){
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]=k;
        }
    }

    public int find_root(int x,int[] parent){
        int x_root = x;
        while(parent[x_root]!=-1){
            x_root = parent[x_root];
        }
        return x_root;
    }

    public int union_vertices(int x, int y, int[] parent,int[] rank){
        int x_root = find_root(x,parent);
        int y_root = find_root(y,parent);

        if(x_root==y_root)
            return 0;
        else {
            if(rank[x_root]>rank[y_root])
                parent[y_root]=x_root;
            else if(rank[x_root]<rank[y_root]){
                parent[x_root]=y_root;
            }else {
                parent[x_root] = y_root;
                rank[y_root]++;
            }
            return 1;
        }
    }
}
