package com.alg.Graph;

public class denseGraph {
    int n,m;
    boolean directed;
    boolean[][] map;

    public denseGraph(int n,boolean directed){
        this.n = n;
        this.m = 0;
        this.directed = directed;
    }
    int V(){
        return n;
    }
    int E(){
        return m;
    }

    public void addEdge(int v,int w){

        if(v>0&&v<n&&w>0&&w<m) {
            if(hasEdge(v,w))
                return;
            map[v][w] = true;
        }
        if(!directed)
            map[w][v]=true;
        m++;
    }

    public boolean hasEdge(int v,int w){
        if(v>0&&v<n&&w>0&&w<m)
            return map[v][w];
        throw new IllegalArgumentException("越界");
    }

}
