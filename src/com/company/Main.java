package com.company;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] a = {6,2,5,8,1,4,32,9,7,3,11};
        List<Integer> list = new ArrayList<Integer>();
        for(int x:a)
            list.add(x);
        char[] str={' '};
        List<Integer> list1 = new ArrayList<>();
        guiBinSorted gui = new guiBinSorted();
        gui.mergeSort(a,0,a.length-1);
        for(int x:a){
            System.out.println(x);
        }
        System.out.println("ok");
    }

}

        // write your code here
        /**
         *直接插入排序test
        int i;
        Integer[] a = {70,60,50,40,30,10};
        Integer[] b = {5,5,9,6,3,7,2,8,5};
        System.out.printf("before sort:");
        for (i=0; i<b.length; i++)
            System.out.printf("%d ", b[i]);
        System.out.printf("\n");
//        straightInsertSortMethod straightInsertSort1 = new straightInsertSortMethod();
//        straightInsertSort1.sorted(a);
        quickSort quickSort = new quickSort();
        quickSort.quickSorted(b,0,8);
        System.out.printf("after  sort:");
        for (i=0; i<b.length; i++)
            System.out.printf("%d ", b[i]);
        System.out.printf("\n");
        */
        /**
        * 并查集test
        int vertices ;
        Scanner x = new Scanner(System.in);
        vertices = x.nextInt();
        vertices = 6;
        int[] parent = new int[vertices];
        int[] rank = new int[vertices];
        disgoint_set disgointSet = new disgoint_set();
        disgointSet.initialize(parent,-1);
        disgointSet.initialize(rank,0);
        int edges[][] = {
                {0,1},{1,2},{1,3},
                {2,3},{3,4},{4,5},
                {3,5},{2,4},{1,5}
        };
        int i;
        int temp=0;
        for(i=0;i<edges.length;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            if(disgointSet.union_vertices(x,y,parent,rank)==0){
                System.out.println("exist");
                temp++;
            }
        }
        System.out.println("there are "+ temp +" Cycles");
        if(temp==0){
        System.out.println("null");
        }
    }*/
        /**
         * 吃鸡组队test
         * @Param 1 2 3 4
         * @return
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        String arr = x.next();
        String[] arrs = arr.split("");
        return f(arrs);
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int[] arr = new int[4];
        Integer[] ansl = new Integer[];
        for(int i=0;i<num;i++){
            arr[0] = x.nextInt();
            arr[1] = x.nextInt();
            arr[2] = x.nextInt();
            arr[3] = x.nextInt();
            int ans = arr[3] + arr[1]/2;
            if (arr[0] > arr[2]) {
                ans += arr[2];
                if (arr[1]%2 == 1) {
                    System.out.println("odd 2");
                    if (arr[0] - arr[2] >= 2) {
                        System.out.println("1 add");
                        System.out.println("   "+ ans);
                        ans += 1;
                        System.out.println("   "+ ans);
                        ans += (arr[0] - arr[2] - 2)/4;
                        System.out.println("   "+ ans);
                    }
                } else {
                    ans += (arr[0] - arr[2])/4;
                }
            } else {
                ans += arr[0];
            }
            ansl[i] = ans;
        }
        for (int i = 0 ; i<num;i++) {
            System.out.println(ansl[i]);
        }
    }*/
    /**
     *
     Scanner x = new Scanner(System.in);
     int n, m;
     n = x.nextInt();
     m = x.nextInt();
     Integer[] arr = new Integer[n];
     int[] f = new int[m];
     int[] r = new int[m];
     for (int i = 0; i < n; i++) arr[i] = x.nextInt();
     for (int i = 0; i < m; i++) {
     f[i] = x.nextInt();
     r[i] = x.nextInt();
     }
     ArrayList<Integer> arrayList = new ArrayList<>();

     for (int i = 0; i < m; i++) {
     if (f[i] == 1) {
     Arrays.sort(arr, 0, r[i], Collections.reverseOrder());
     } else Arrays.sort(arr, 0, r[i]);
     }
     System.out.println(arr);
     */

