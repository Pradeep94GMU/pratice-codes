public class RepetedString {
    public static void main(String[] args) {

        String s = "abababc";

        //taking both string
        //If a String s is a repetitive string, you will find s is a substring of ss.substring(1, ss.length()), where ss = s + s.
        //The reason is, considering the basic case in which s is somestring s' repeated twice, where we have s = s' + s'.
        // Imagine now you hold s to find a match in ss. Only when the cursor moves to the second s' in ss, we will find a match.
        //Meanwhile, you get the pattern length which is the index of s in ss.substring() - 1.
        //So in any repetitive string, you will be able to find a match once proceed the pattern length.
        System.out.println(s +" "+ s);
        int idx = (s + s).indexOf(s, 1);
        if(idx < s.length()){
               System.out.println("Print success\n");
            }
                else{
                    System.out.println("Not success");
        }

    }
}
