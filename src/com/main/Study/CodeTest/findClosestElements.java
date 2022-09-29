package com.main.Study.CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findClosestElements {
    public static void main(String[] args){
        System.out.println("Start");
        int[] arr = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int k = 12;
        int x = 6;

        System.out.println(arr+" / "+k+" / "+x);
        List<Integer> result = mySolution(arr, k, x);
        System.out.println(result.toString());
    }

    public static List<Integer> mySolution(int[] arr, int k, int x){
        List<Integer> result = new ArrayList<>();
        double pivot = 100000;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            double value = Math.abs(x-arr[i]);
            if(i==0 || value<pivot) {
                pivot = value;
                count = i;
            }else
                break;
        }
        result.add(arr[count]);

        int smallCount=count-1;
        if(smallCount<0)
            smallCount=0;
        int bigCount=count+1;
        if(bigCount>arr.length)
            bigCount=arr.length-1;

        for(int i=1; i<k; i++){
            double smallValue = Math.abs(x-arr[smallCount]);
            double bigValue = Math.abs(x-arr[bigCount]);
            System.out.println(i+" / "+smallCount+" : "+arr[smallCount]+" - "+smallValue+" / "+bigCount+" : "+arr[bigCount]+" - "+bigValue);
            if(smallValue<=bigValue){
                result.add(arr[smallCount]);
                smallCount -= 1;
            }else {
                result.add(arr[bigCount]);
                bigCount += 1;
            }
            if(smallCount<0 || smallCount>=count)
                smallCount=bigCount;
            if(bigCount>arr.length || bigCount<=count)
                bigCount=smallCount;
        }

        return result.stream().sorted().collect(Collectors.toList());
    }
}
