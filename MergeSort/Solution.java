package MergeSort;

import java.util.ArrayList;

public class Solution {

    private static void mergeArr(int []arr , int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left<=mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        // copy the merge element from temp to back to the original array
        for (int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    static void divideArr(int []arr , int low , int high){
        if (low>=high){
            return;
        }
        int mid = (low+high)/2;
        divideArr(arr , low , mid);
        divideArr(arr , mid+1 ,high);
        mergeArr(arr , low , mid , high);
    }


    public static void main(String[] args) {
        int []arr = {48 ,36 , 13, 52 , 19 , 94 , 21};
        int n = arr.length;
        divideArr(arr , 0 , n-1);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

}
