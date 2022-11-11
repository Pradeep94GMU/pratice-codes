import java.util.Arrays;

public class ProductSelf {
    public static void main(String[] args) {

        int arr[] = {1,2,0,4};

        int res[] = new int[arr.length];

        //initialize the res[] as 1
        for(int i = 0; i < arr.length; i++) {
            res[i] = 1;
        }

        //find the left part product
        //find the right part of product
        int left = 1;
        for(int i = 0; i < arr.length; i++){
            res[i] = res[i] * left;
            left = left * arr[i];
        }
        int right = 1;
        //same thing apply for right but from opp direction
        for(int i = arr.length - 1; i >= 0; i--){
            res[i] = res[i] * right;
            right = right * arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
