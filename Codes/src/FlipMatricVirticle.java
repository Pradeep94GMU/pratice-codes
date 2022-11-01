public class FlipMatricVirticle {
    public static void main(String[] args) {

        int nums[][] = {
                {2,3,4,3,5,6,7,8},
                {1,0,0,0,0,0,0,0}

        };
        System.out.println("Original:");
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
           System.out.println();
        }
        for(int j = 0; j < nums[0].length; j++){
            for(int i = 0; i < 1; i++) {
                int temp = nums[i][j];
                nums[i][j] = nums[i+1][j];
                nums[i+1][j] = temp;
            }
        }
        System.out.println("\nAfter flip:");
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
