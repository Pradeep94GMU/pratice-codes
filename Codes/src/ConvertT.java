import java.util.Scanner;
import java.util.*;

public class ConvertT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of number");
        int y = sc.nextInt();
        System.out.println("Enter any number");
        int x = sc.nextInt();
        int nums[] = new int[y];
        int i = 0;
        while(x != 0){
            int single = x % 10;
            x = x/10;
            nums[i] = single;
            i++;
           // System.out.print(single+ " ");
        }
        System.out.println();
        for(int j = nums.length - 1; j >=0; j--){
            System.out.print(nums[j]+ " ");
        }

        //how to change array element into single digit


    }
}
