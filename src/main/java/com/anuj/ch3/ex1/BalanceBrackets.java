package com.anuj.ch3.ex1;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceBrackets {
    Deque<Character> stack = new ArrayDeque<>();

    public int getUnbalancedBracketPosition(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return i;
                }
                char prev = stack.pop();
                if (prev != '(') {
                    return i;
                }
            }
        }
        if (!stack.isEmpty()) {
            return s.length();
        }
        return -1;
    }
}
