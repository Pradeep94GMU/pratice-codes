import java.util.*;

public class DivideIntoHalf {
    public static void main(String[] args) {
        int nums[] = { 5,5,3,6,5,3};
        int count = 0;
        //Sorting an arry will help to find the equal elements
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //check in whole array
        for(int i = 0; i < nums.length - 1; i++){
            //using a condition to check for my next equal element
            if (nums[i] == nums[i + 1]) {
                //if found then add 1st element which is proceesed time
                count += nums[i];
                //i will keep this item as key to varify for all right side elements
                int key = nums[i];
                int j = i + 1; //assign j as next equal value of i to check for all equal item in right side of array
                //i am using another pointer to traverse all remaing equal elements and divide into half
                while(j < nums.length && nums[j] == key  ){
                    //two condition we will be checking
                    //if number are even then no need to perform ceiling operation (add next integer number)
                    if(nums[j] % 2 == 0){
                        nums[j] = nums[j]/2;
                        j++;
                    }
                    //if proccessed is odd then need ceiling funtion
                    else{
                        //store item into temp for ceiling operation after diving into 2
                        int temp = nums[j]/2;
                        //use Math.round funtion to get ceiling funtion and store in a variable
                        int sum = (int) Math.round(temp + 0.5);
                        //assign sum value into array again
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
