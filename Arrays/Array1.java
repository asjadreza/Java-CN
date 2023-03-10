package Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[3] = 15;
        System.out.println(arr[3]);
        // System.out.println(arr[5]); // unassigned element in array is void(0)

        // character array
        char[] charArray = new char[10];
        // double array
        double[] dArray = new double[10];
        // boolean array
        boolean[] bArray = new boolean[10];
        dArray[3] = 3.3;
        charArray[0] = 'a';
        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(dArray[3]);
        System.out.println(bArray[0]);
       
        sc.close();


    }
}
