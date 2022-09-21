import java.util.*;

public class Matrix {
    public static void main(String[] args) {

        int nums[][] = new int[3][3];
        int k = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                nums[i][j] = k;
                k++;
            }
        }
        for(int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

    }
}
