import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {

        String s = "{()}";
        //the main point is --> we need to store each open bracket into stack and once closing bracket found... pop() element from stack
        //and compare it with your string value
        Stack<Character> ch = new Stack<>();
        int x = s.length() - 1;
        int i = 0;

        while( i <= x){
            //this is adding part into stack when open bracket found
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                ch.add(s.charAt(i));

                i++;
            }
            else{
                //check for stack underflow
                if (ch.isEmpty()){
                    System.out.println("Not balanced");
                    return;
                }
                //pop() it and compare with other bracket for not balanced
                char popStk = ch.pop();
                //need to compare both pop and charAt value
                if(s.charAt(i) == ')'){
                    if(popStk == '[' || popStk == '{'){
                        System.out.println("balanced");
                        return;
                    }
                }
                if(s.charAt(i) == '}'){
                    if(popStk == '(' || popStk == '['){
                        System.out.println("balanced");
                        return;
                    }
                }
                if(s.charAt(i) == ']'){
                    if(popStk == '(' || popStk == '{'){
                        System.out.println("balanced");
                        return;
                    }
                }

                i++;
            }
        }
        System.out.println("balanced");
        return;

    }
}
