package org.coding;

public class ThirdLargestArray {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6};
        int temp = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("largest"+a[a.length-1]);
        System.out.println("2nd largest"+a[a.length-2]);
        System.out.println("3rd largest"+a[a.length-3]);
    }
}
