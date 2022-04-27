import java.util.Arrays;

//Reverse An Array
public class Reverse {
    public static void reverse(int[] arr,int size){
        int start=0;
        int end=size-1;
        int temp;
        while(start < end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Actual Array "+ Arrays.toString(arr));
        reverse(arr,arr.length);
    }

}
