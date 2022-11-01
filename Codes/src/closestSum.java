public class closestSum {
    public static void main(String[] args) {
            int a[] = {1,4,5,7};
            int b[] = {10,20,30,40};

            int x = 32;
            int l = 0;
            int r = b.length - 1;

            int res_l = 0;
            int res_r = 0;

            int var = Integer.MAX_VALUE;

            while(l < a.length && r >=0){

                if(Math.abs(a[l] + b[r] - x) < var){
                    res_l = l;
                    res_r = r;
                    var = Math.abs(a[l] + b[r] - x);
                }
                //i need to update the pointer values
                if(a[l] + b[r] > x){
                    r--;
                }
                else{
                    l++;
                }



            }
        System.out.println("\nclosest value are: "+a[res_l]+" and "+b[res_r]);

    }
}
