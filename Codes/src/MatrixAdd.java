public class MatrixAdd {
    public static void main(String[] args) {
        int nums[][] = {
                {1,2,3},
                {3,2,1}
        };
        int max = Integer.MIN_VALUE;
        System.out.println(nums.length);
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j <nums[i].length ; j++){
                //System.out.print(nums[i][j]+" ");
                sum = sum + nums[i][j];
            }
            if(sum > max){
                max = sum;
            }
            //System.out.println(sum);
        }
        System.out.println(max);

    }
}
