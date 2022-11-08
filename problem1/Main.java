import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        balancedBracket("({[]})");

        balancedBracket("({{}");
    }


    public static void balancedBracket(String str){
        Stack<Character> stack=new Stack<>();
        int i;
        for( i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(openBracket(a)){
                stack.push(a);
            }else {
                if(stack.empty())
                    break;
                stack.pop();
            }
        }

        if(i==str.length() && stack.empty()){
            System.out.println("The entered String has Balanced Brackets");
        }else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
    public static boolean openBracket(char a){
        return a == '(' || a == '{' || a == '[';
    }



}