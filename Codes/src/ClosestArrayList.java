import java.util.ArrayList;

public class ClosestArrayList{
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int brr[] = {10,20,30,40};
        int n = arr.length;
        int m = brr.length;
        int x = 31;
        int ind1=0;
        int ind2=brr.length-1;
        ArrayList<Integer> res=new ArrayList<>();
        res.add(arr[0]);
        res.add(brr[ind2]);
        int diff=Math.abs(arr[0]+brr[ind2]-x);
        while(ind1<n && ind2>=0){
            int sum=arr[ind1]+brr[ind2];
            if(Math.abs(sum-x)<diff){
                diff=Math.abs(sum-x);
                res.clear();
                res.add(arr[ind1]);
                res.add(brr[ind2]);
            }
            if(sum<x){
                ind1++;
            }
            else if(sum>x){
                ind2--;
            }
            else{
                System.out.println(res);
                return;
            }
        }
        System.out.println(res);
        return;
    }
}
