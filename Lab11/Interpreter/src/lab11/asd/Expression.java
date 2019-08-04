package lab11.asd;

import java.util.Stack;

public abstract class Expression {
    Stack<String> stack = new Stack<>();
    String input;
    public Expression(String input){
        this.input = input;
    }
    public abstract String interpret();
}
