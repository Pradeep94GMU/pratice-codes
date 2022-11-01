public class WindowSliding {
    public static void main(String[] args) {

        int arr[] = {1,4,22,2,7,10};
        int k = 2;

        int l = 0;
        int r = 0;
        int sum = 0;
        if(arr.length < k){
            System.out.println("-1");
            return;
        }
        int maxx = arr.length + 1;
        while( r < arr.length){
            if(r - l + 1 <= k){
                sum += arr[r++];
                maxx = Math.max(sum, maxx);
            }
            if(r - l + 1 > k){
                sum -= arr[l++];
            }
        }
        System.out.println(maxx);

    }
}
