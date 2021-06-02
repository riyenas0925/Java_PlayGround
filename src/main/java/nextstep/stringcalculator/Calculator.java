package nextstep.stringcalculator;

public class Calculator {
    private int result;

    public Calculator(String result) {
        this.result = Integer.parseInt(result);
    }

    public void execute(String operator, String operand) {
        int num = Integer.parseInt(operand);

        switch (operator) {
            case "+" : add(num);
                break;
            case "-" : subtract(num);
                break;
            case "*" : multiply(num);
                break;
            case "/" : divide(num);
                break;
        }
    }

    public void add(int num) {
        result = result + num;
    }

    public void subtract(int num) {
        result = result - num;
    }

    public void multiply(int num) {
        result = result * num;
    }

    public void divide(int num) {
        result = result / num;
    }

    public int getResult() {
        return result;
    }
}
