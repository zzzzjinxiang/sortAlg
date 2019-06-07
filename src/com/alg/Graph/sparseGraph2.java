package com.alg.Graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class sparseGraph2 {
    private int n,m;
    boolean directed;
    ArrayList<LinkedList<Integer>> map;
    public sparseGraph2(int n,boolean directed){
        this.n = n;
        this.m = 0;
        this.directed = directed;
    }

    public void addEdges(int v,int w){
        if(v>0&&v<n&&w>0&&w<m)
            map.get(v).add(w);
        else return;
        if(v!=w && !directed)
            map.get(w).add(w);
        m++;
    }

    public boolean hasEdge(int v,int w){
        if(v>0&&v<n&&w>0&&w<m){
            for(int i=0;i<map.get(v).size();i++)
                if(map.get(v).get(w)==w)
                    return true;
                return false;
        }
        throw new IllegalArgumentException("out of index");
    }

}
