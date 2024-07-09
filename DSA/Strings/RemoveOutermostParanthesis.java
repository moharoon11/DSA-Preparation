package Strings;

public class RemoveOutermostParanthesis {
// https://www.linkedin.com/in/shyam2911/ - later connect and ask about it
    public static void main(String[] args) {

        System.out.println(remove("(()())()"));
        System.out.println(remove("(()(()))"));
        System.out.println(remove("()()"));
        System.out.println(remove(""));

           }


    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        int opened = 0;

        
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) result.append(c);
            if (c == ')' && opened-- > 1) result.append(c);
        }

        return result.toString();
    }

    public static String remove(String s) {
        int left = 0;
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i) == '(' && left == 0) {
                sb.append('(');
                left++;
            } else if(s.charAt(i) == ')' && left == 1) {
                sb.append(')');
                left--;
            }
        }

        return sb.toString();
    }

}
