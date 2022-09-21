public class Matrix2 {
    public static void main(String[] args) {

        int nums[][] = {
                {1,2,3},
                {2,4,5},
                {5,7,8}
        };

        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
