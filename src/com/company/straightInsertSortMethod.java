package com.company;

public class straightInsertSortMethod {
    //选取一个有序表，一个无序表
    public void sorted(Integer[] arrays){
//        if(arrays.length<2)
//            return;
        int len = arrays.length-1;
        int first;
        int first2;
        int move;
        for(first2=1;first2<=len;first2++){
            for(first=first2-1;first>=0;first--){
                if(arrays[first]<arrays[first2])
                    break;
            }
            int temp = arrays[first2];
            for(move=first2-1;move>=first+1;move--){
                arrays[move+1]=arrays[move];
            }
            arrays[first+1]=temp;
        }
    }
}
