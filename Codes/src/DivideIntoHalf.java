import java.util.*;

public class DivideIntoHalf {
    public static void main(String[] args) {
        int nums[] = { 5,5,3,6,5,3};
        int count = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]) {
                count += nums[i];
                int key = nums[i];
                int j = i + 1;
                //i am using another pointer to traverse all remaing equal elements and divide into half
                while(j < nums.length && nums[j] == key  ){
                    if(nums[j] % 2 == 0){
                        nums[j] = nums[j]/2;
                        j++;
                    }
                    else{
                        int temp = nums[j]/2;
                        int sum = (int) Math.round(temp + 0.5);

                        nums[j] = sum;
                        j++;
                    }
                }
            }
            else{
                count += nums[i];
            }
        }
        count = count + nums[nums.length - 1];
        System.out.println("Value of total: "+count);
    }
}
