public class CeilingFn {
    public static void main(String[] args) {
         int n = 5;
         int x = n /2;
         if(n % 2 == 0){
             System.out.println(x);
         }
         else{
             int sum = (int) Math.round(x + 0.5);
             System.out.println(sum);
         }
         //simply we have to add another 0.5 to given digit and take round of it to get the ceiling number


    }
}
