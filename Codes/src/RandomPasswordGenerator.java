import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    static public void passStrength(int pasLen){
        if(pasLen < 6){
            System.out.println("Please update with strong password");
        }
        else if(pasLen < 12){
            System.out.println("thats a strong password.. Great choice");
        }
        else{
            System.out.println("Very difficult to remeber this passoword");
        }
    }
    static public void randompassword(int nlen, int np){
        //we need a array to store the password
        char arr[] = new char[nlen];
        //we will generate random number by using ASCII value

        for(int j = 0; j < np; j++) {
            for (int i = 0; i < nlen; i++) {
                int numberR = (int) (Math.random() * 70); // this will only give me 0 or 1 max SO we need to use all combination( 10 + 26 + 26)
                char numC = ' ';
                //0-9 will be digit
                if (numberR <= 9) {
                    //store number
                    //we need to convert the random number into ASCII
                    int asciiN = numberR + 48; //as the lowest ASCII is 48
                    numC = (char) (asciiN);
                    arr[i] = numC;
                }
                //10-35 will be Capts char
                else if (numberR <= 35) {
                    int asciiN = numberR + 55;
                    numC = (char) (asciiN);
                    arr[i] = numC;
                } else if (numberR <= 65){
                    //lowerletter
                    int asciiN = numberR + 61;
                    numC = (char) (asciiN);
                    arr[i] = numC;
                }
                else {
                    //lowerletter
                    if(numberR == 64){
                        int asciiN = (char)numberR;
                        numC = (char) (asciiN);
                        arr[i] = numC;
                    }else{
                        int asciiN = (char)numberR;
                        numC = (char) (asciiN);
                        arr[i] = numC;
                    }


                }





                //System.out.print(numC + " ");


            }
            System.out.println();
            System.out.println(Arrays.toString(arr));
        }


    }
    public static void main(String[] args) {
        //i need to ask user to enter the number of password he/she needs
        //i need a length of password

        //for both of the above approch i need scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter total number of password you need");
        int passNo = sc.nextInt();

        System.out.println("Please enter length of your required password");
        int passLen = sc.nextInt();

        //now i need to create a funtion that will generate a password with required length
        //and with combination of alphabase, numbers and ALPHABATE
        randompassword(passLen,passNo);
        // show the strength of password
        passStrength(passLen);
    }
}


//0-9 --> 48 - 57   ... so 48 - 0 = 48 add to get ascci (in random generated number
//A - Z --> 65 - 90 ... so 65 - ( 10 number are digit) = 65- 10 = 55 add to get ascii from caps
// a - z --> 97 - 122 .. 97 - 10(digit) - 26(char) = 97 - 36 = 61 add to get ascii from small