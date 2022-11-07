import java.util.Arrays;

public class mergeSort {

    static void Merge(int arr[], int left, int mid, int right){
        int m = mid - left + 1;
        int n = right - mid;
        int Left[] = new int[m];
        int Right[] = new int[n];
        //copy into both array
        for(int i = 0; i < m; i++){
            Left[i] = arr[left + i];
        }
        for(int j = 0; j < n; j++){
            Right[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < m && j < n){

            if(Left[i] < Right[j]){
                arr[k] = Left[i];
                i++;

            }
            else{
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        //now some array element will be left out so add them at last
        while(i < m){
            arr[k] = Left[i];
            i++;
            k++;
        }

        while(j < n){
            arr[k] = Right[j];
            j++;
            k++;
        }

    }
    static void MergeSort(int arr[], int left, int right){

        if(left == right){
            return;
        }
        int mid = (left + right) / 2;
        MergeSort(arr, left, mid);
        MergeSort(arr, mid + 1, right);

        Merge(arr, left, mid, right);



    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 2, 9, 5, 12, 3};
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        System.out.println(Arrays.toString(arr));
        MergeSort(arr, i , j);

        System.out.println(Arrays.toString(arr));


    }
}
