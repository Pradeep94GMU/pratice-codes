import java.sql.SQLOutput;
import java.util.*;

public class Palindrom {
    public static void main(String[] args) {
        int num = 123221;

        List<Integer> al = new ArrayList<>();
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            al.add(rem);
            num = num / 10;
            count++;

        }
        System.out.println(al);
        if( count == 1){
            System.out.println("Palindrom");
            return;
        }
        int last = count - 1;
        for(int i = 0; i < count; i++){

            if(al.get(i) != al.get(last)){
                System.out.println("Not palindrom");
                return;
            }
            else{
                last--;
            }
        }

        System.out.println("Palindrom");

    }
}
