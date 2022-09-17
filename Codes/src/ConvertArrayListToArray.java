import java.util.*;

public class ConvertArrayListToArray {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(32);
        al.add(7);
        al.add(88);
        al.add(3);
        al.add(9);
        //System.out.println(al);

        //convert into array
    int nums[] = new int[al.size()];
    int i = 0;
    //temp is int data type which will store each value of collection and then use it to update array value
        for(int temp : al){
            nums[i] = temp;
            i++;
    }
        //to print an array without any loop
        //we can make all element of array as a string and print it.
        //Arrays.toString(arr_variable_name);
        System.out.println("The Array is: "+Arrays.toString(nums));
    }
}
