import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        //we need 4 variable to store A,B,Q and R
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a and b\n");
        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int a=Math.max(A,B);
        int b = Math.min(A,B);

        while(a > b){
            int r = a % b;
            if(r == 0){
                System.out.println("The Gcd of both number "+A+" and "+B+" is: "+b);
                return;
            }
            else{
                a = b;
                b = r;
            }


        }

    }
}
