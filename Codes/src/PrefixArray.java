import java.util.Arrays;
import java.util.Scanner;

public class PrefixArray {
    public static void main(String[] args) {
        int nums[] = {0,1,1,0,1,1,1};
        int arr[] = new int[nums.length];

        //basic thing is to store first element and then add next element from other element and store in this array.
        arr[0] = nums[0];
        int i = 0;
        int j = nums.length;


        //this operation to store all the value when adding from next element
        for(i = 1; i < j ; i++){
            arr[i] = arr[i - 1] + nums[i];
        }
        System.out.println("Total number of 1s in the given array is: "+arr[arr.length - 1]);
        System.out.println("Array Value: "+ Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Values between both m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        //System.out.println("FInd the 1st in range of i: "+m+" and "+n);
        int res = arr[n - 1] - arr[m - 1] + 1;
        System.out.println("The result :"+res);

    }
}
