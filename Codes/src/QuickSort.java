public class QuickSort {
    static void quickSort(int nums[],int low, int high){
        if(low < high){
            //we need pivot index to use for diving my array untill base case
            int pI = partition(nums,low,high);  // we are not only dividing but also sorting at the same time
            //we will use the return partition index to divide remainng array into 2 half
            quickSort(nums,low,pI - 1);
            quickSort(nums,pI + 1, high);
        }
    }

    static int partition(int nums[], int low, int high){
        int pivot = nums[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(nums[j] <= pivot){
                i++;
                swap(nums,i, j);
            }
        }
        swap(nums,i + 1, high);
        return i + 1;
    }

    static void swap(int nums[], int firstItem, int secItem){
        int temp = nums[firstItem];
        nums[firstItem] = nums[secItem];
        nums[secItem] = temp;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int nums[] = {2,91,12,13,9,11};
        int low = 0;  //index of 2(first)
        int high = nums.length - 1;  // index of 4(last)
        quickSort(nums,low,high);

        for(int item : nums){
            System.out.print(item+" ");
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("\nTotal runtime:"+totalTime/1000000+" in ms");
    }

}
