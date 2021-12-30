package chapter02;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            //insert key into the sorted sequence [0 .. j-1]
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }
}
