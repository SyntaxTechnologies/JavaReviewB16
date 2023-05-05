package com.syntax.review6;

public class Test {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;            }
            }
        }


        // Print the array without duplicates
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
