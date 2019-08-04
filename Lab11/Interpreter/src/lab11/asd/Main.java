package lab11.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String tokenString = "- + 10 5 - 8 2";
        Expression expression = new impExpression(tokenString);
        System.out.println(expression.interpret());
    }
}
