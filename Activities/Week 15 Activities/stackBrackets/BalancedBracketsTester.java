package stackBrackets;

import java.util.Stack;

public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets balanced = new BalancedBrackets();

        //Regular Code Function
        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()") + "\n");

        System.out.println(balanced.checkBalance("[]"));
        System.out.println(balanced.checkBalance("[[][]]"));
        System.out.println(balanced.checkBalance("[[[[[][[]]]]]]"));
        System.out.println(balanced.checkBalance("[[]") + "\n");

        //New Code Function
        System.out.println(balanced.checkBalance("())"));
        System.out.println(balanced.checkBalance(")()"));

        //Extra Credit Proof
        System.out.println(balanced.checkBalance("(([{}]))"));
        System.out.println(balanced.checkBalance("{]()}") + "\n");
    }
}
