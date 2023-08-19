package BubbleSort;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        // display
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
