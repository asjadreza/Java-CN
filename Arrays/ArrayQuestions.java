package Arrays;
import java.util.*;

public class ArrayQuestions {

    // arrange numbers
    public static void arangeNumbers(int n){
        int[] arr = new int[n];
        int val = 1;
        int start = 0, end = n-1;
        while(start <= end){
            if(val%2 != 0){
                arr[start] = val;
                val++;
                start++;
            } else {
                arr[end] = val;
                val++;
                end--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // return array sum
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            // sum = sum + arr[i];
        }
        return sum;
    }

    // linear search
    public static int linearSearch(int x, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    // take input
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    // displaying array
    public static void print(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main 
    public static void main(String[] args) {
        // int[] arr = takeInput();
        // print(arr);
        // System.out.println(sum(arr));
        // System.out.println(linearSearch(5, arr));

        arangeNumbers(6);

    }
    
}
