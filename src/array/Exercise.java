package array;

import java.util.Arrays;

public class Exercise {

    static void printArr(int arr[]) {
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
    static void reverseArr(int arr[]) {
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    static void findMaxAndMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i: arr) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        System.out.print("Min Value: "+min+" Max Value: "+max);
    }
    static void calculateSumAndAverage(int arr[]) {
        int sum = 0;
        int avg = 0;
        for(int i: arr) {
            sum += i;
        }
        avg = sum/10;
        System.out.print("Average: "+avg+" Sum: "+sum);
    }
    static void searchElement(int arr[], int searchEle) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == searchEle) {
                System.out.print(i);
            }
        }
    }
    static void sortArr(int arr[]) {
        Arrays.sort(arr);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 7, 13, 87, 34, 7, 45, 222, 42, 10};
        printArr(arr);
        reverseArr(arr);
        findMaxAndMin(arr);
        calculateSumAndAverage(arr);
        searchElement(arr, 7);
        sortArr(arr);
    }
}
