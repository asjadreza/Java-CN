package Recursion;


class Recursion1 {

    public boolean checkSorted(int input[]){

        if(input.length <= 1){
            return true;
        }
        int []smallInput = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallInput[i-1] = input[i];
        }
        boolean smallAns = checkSorted(smallInput);
        if(!smallAns){
            return false;
        }
        if(input[0] <= input[1]) return true;
        else return false;
        
    }

    // another method
    public boolean checkSorted_2(int input[]) {
        if(input.length <= 1){
            return true;
        }
        if(input[0] > input[1]){
            return false;
        }

        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++){
            smallInput[i - 1] = input[i];
        }

        boolean smallAns_2 = checkSorted_2(smallInput);
        return smallAns_2;
        // if(smallAns_2){
        //     return true;
        // } else {
        //     return false;
        // }

    }

}


public class MoreRecursion {
    public static void main(String[] args) {
        Recursion1 rec = new Recursion1();
        int input[] = {2, 1, 3, 6, 9}; 
        // int []input = {1, 3, 6, 8}; 
        System.out.println(rec.checkSorted(input));

        System.out.println(rec.checkSorted_2(input));
    }
    
}
