import java.util.*;

public class Bitsetdemo {
    public static void main(String[] args) {

        int nums[] = { 2,1,2,1,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,1,2,2,2,2,1,2,3};
        boolean arr[] = new boolean[nums.length];
        int max_count = 0;

        for(int i = 0; i < nums.length; i++){
            int item = nums[i];
            int local_count = 1;
            int j = 0;
            while(j < nums.length){
                if(i != j && nums[i] == nums[j] ){
                    local_count++;
                    j++;
                }
                else{
                    j++;
                }
            }
            max_count = Math.max(local_count,max_count);

        }
        System.out.println(max_count);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
