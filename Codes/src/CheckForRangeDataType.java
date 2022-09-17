public class CheckForRangeDataType {
    public static void main(String[] args) {
        final int n = 1000000000;
        int i = n;
        int count = 0;
        while(i>0){
             i = i / 10;
             count++;
        }
        System.out.println(n+" "+count);
    }
}
