public class Subarrrrr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7};

        int l = 0;
        int r = 0;
        int sum = 0;
        int x = 12;
        int left = 0;
        int right = 0;
        while(r < arr.length){

            if(sum == x){
                System.out.println(left);
                System.out.println(right);
                return;
            }
            else if(sum > x){
                sum -= arr[l];
                l++;
            }
            else{
                sum += arr[r];
                r++;
            }
        }
    }
}