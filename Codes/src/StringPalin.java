public class StringPalin {
    public static void main(String[] args) {

        String s = "aboa";

        int len = s.length();
        int r = len - 1;

        for(int l = 0; l < len/2; l++){
            if(s.charAt(l) != s.charAt(r)){
                System.out.println("Not palindrom");
                return;
            }
            else{
                r--;
            }
        }
        System.out.println("palindrom");
        return;

    }
}
