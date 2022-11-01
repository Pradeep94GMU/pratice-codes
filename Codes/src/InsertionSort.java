public class InsertionSort {


    public static void main(String[] args) {

        //logic used in insertion sort is:
        //we take one card fromt he table and place in empty left hand
        //take another card from table and compare with left hand card
        //if card is less then left hand card then place left
        //if more then place on the right
        int nums[] = { 9,1,4,2,7,5};

        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;

            //this while loop to check left array card value with key
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
