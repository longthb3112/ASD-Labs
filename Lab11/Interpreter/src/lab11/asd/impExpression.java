package lab11.asd;

public class impExpression extends Expression{

    public impExpression(String input) {
        super(input);
    }

    @Override
    public String interpret() {
        if(input == null ||input == ""){
            return "";
        }
        String[] inputs = input.split(" ");
        for (int i=0;i< inputs.length;i++){
            if(isNumeric(inputs[i])){
                if(isNumeric(stack.peek())){
                    int number = Integer.parseInt(stack.pop());
                    String sign = stack.pop();
                    stack.push(String.valueOf(calculateOutput(number,Integer.parseInt(inputs[i]), sign)));
                }else{
                    stack.push(inputs[i]);
                }
            }else{
                stack.push(inputs[i]);
            }
        }
       if(stack.size() > 1){
           int number2 = Integer.parseInt(stack.pop());
           int number1 = Integer.parseInt(stack.pop());
           String finalSign = stack.pop();
           stack.push(String.valueOf(calculateOutput(number1,number2, finalSign)) ) ;
       }
       return stack.pop();
    }

    private int calculateOutput(int number1,int number2, String sign) {
        int output =0 ;
        switch (sign){
            case "+":
                output = number1 + number2 ;
                break;
            case "-":
                output =  number1 - number2;
                break;
            case "*":
                output = number1 * number2;
                break;
            case "/":
                output = number1 / number2;
                break;
        }
        return output;
    }

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }
}
