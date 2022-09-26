package com.dsapractices.dsa.service;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    private static boolean isOpening(char ch){
        return ch == '(' || ch == '{' || ch == '[';
    }

    private static boolean isMatching(char ch, char peek){
        return (ch == ')' && peek == '(') || (ch == ']' && peek == '[') || (ch =='}' && peek == '{');
    }

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param str
     * @return
     */
    private static boolean isValidate(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(isOpening(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(isMatching(ch, stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }


    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param s
     * @return
     */
    public static boolean isValidateBetter(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }else if(ch == '['){
                stack.push(']');
            }else if(ch == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || ch != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean result = isValidateBetter(s);
        System.out.println(result);
    }
}
