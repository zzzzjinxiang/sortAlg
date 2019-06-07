package com.alg.Graph;

public class sparseGraph {
    private char[] mVexs;
    private int[][] mMartirx;
    public sparseGraph(char[] vexs,char[][] edges){
        int vlen = vexs.length;
        int elen = edges.length;
        mVexs = new char[vlen];
        for(int i=0;i<mVexs.length;i++)
            mVexs[i] = vexs[i];
        mMartirx = new int[vlen][vlen];
        for(int i=0;i<elen;i++){
            int p1 = getPosition(edges[i][0]);
            int p2 = getPosition(edges[i][1]);
            mMartirx[p1][p2] = 1;
            mMartirx[p2][p1] = 1;
        }
    }
    public int getPosition(char ch){
        for(int i=0;i<mVexs.length;i++){
            if(mVexs[i]==ch)
                return i;
        }
        return -1;
    }
}
