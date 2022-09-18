import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to check for prime");
        int inputVal = sc.nextInt();
        int count = 1;
        for(int i = 2; i < 10; i++){

            if(inputVal % i == 0){
                count++;
            }

        }
        if(count == 2){
            System.out.println("prime");
            return;
        }
        else {
            System.out.println("Not prime");
        }

    }
}
