package org.coding;

public class LargestArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6};
        int max = a[0];//1

        for(int i = 0;i< a.length;i++){
            if(a[i]>max){//1
                //for min if(a[i]<min)
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
