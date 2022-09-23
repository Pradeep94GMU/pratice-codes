public class PalindromWithoutExtraSpace {
    public static void main(String[] args) {

        int num = 12321;

        //we need a value which can be useful to get 1st element of number
        //how we can get it?
        //just by dividing with same number of multiple of 10;
        int divisor = 1;
        while((num / divisor) >= 10){
            //we got our divisor to get 1st element of number
            divisor = divisor * 10;
        }
        //using 1st element we can compare to last element so for that we need last element
        while(num != 0){
            int leadingNum = num / divisor;
            int tailingNum = num % 10;
            //check both number are same or not .. if not return false
            if(leadingNum != tailingNum){
                System.out.println("Not palindrom");
                return;
            }
            //we will update the number if both tail and head are same
            num = (num % divisor) / 10;
            //we need to update divisor also
            divisor = divisor / 100; // as we are removing 2 digits from numbers so need to updated divisor by 2 10s digit
        }
        System.out.println("Palidrom");
        return;

    }
}
