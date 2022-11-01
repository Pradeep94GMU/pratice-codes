import java.util.*;

public class gridUnique {
    public static void main(String[] args) {

        int nums[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Set<Integer> ss = new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                ss.add(nums[i][j]);
            }
        }

        if(ss.size() != (nums.length * nums[0].length)){
            System.out.println("Not Unique"+nums.length);
        }
        else{
            System.out.println("unique"+(nums.length * nums[0].length));
        }
    }
}
